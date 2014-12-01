package dotBAK.filesystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.utils.IOUtils;

public class LocalFile extends File {

	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = 8125919086702929591L;

	private FileInputStream _in;
	
	public LocalFile(String pathname) {
		super(pathname);
	}
	
	@Override
	public boolean write(FileSystem destination) {
		try {
			//ensure the file exists
			createNewFile();
			return true;
		} catch (IOException e) {
			destination.log("Couldn't create new file");
			return false;
		}
	}

	@Override
	public Map<String, Object> getMetaData() {
		Map<String, Object> meta = new HashMap<String, Object>();
		meta.put("mtime", lastModified());
		meta.put("abspath", getAbsolutePath());
		meta.put("name", getName());
		return meta;
	}
	
	public FileInputStream getInputStream(){
		return _in;
	}

	// add entry to archive to maintain file headers, and add data
	@Override
	protected void addToArchive(ArchiveOutputStream archive) throws IOException {
		if(isDirectory()) {
			for(File f : listFiles())
				f.addToArchive(archive);
		} else {
			TarArchiveEntry entry = new TarArchiveEntry(this);
	        entry.setSize(length());
	        archive.putArchiveEntry(entry);
	        IOUtils.copy(new FileInputStream(this), archive);
	        archive.closeArchiveEntry();
		}
	}

	@Override
	public File[] listFiles() {
		List<File> subfiles = new ArrayList<File>();
		for(java.io.File f : super.listFiles()) {
			subfiles.add(new LocalFile(f.getAbsolutePath()));
		}
		return (File[]) subfiles.toArray();
	}
}
