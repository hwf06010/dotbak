package dotBAK.filesystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;

import dotBAK.common.Filter;

public class FileTree {
	private Set<File> _topLevelFiles;
	private Set<Filter<File>> _filters;
	private FileSystem _parentFS;
	
	public boolean compress(File destination) throws IOException, ArchiveException {
		// use the archive stream factory to create a tar archive output stream
        ArchiveOutputStream out = new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.TAR, new FileOutputStream(destination));
        for(File file : getFiles()) {
        	file.addToArchive(out);
        }
        out.finish(); 
        out.close();
        
        return true;
	}
	
	public Set<File> getFiles() {
		Set<File> files = new HashSet<File>();
		for(File f : _topLevelFiles) {
			boolean include = true;
			for(Filter<File> filt : _filters) {
				if(!filt.include(f))
					include = false;
			}
			if(include)
				files.add(f);
		}
		return files;
	}
	
	public FileSystem getFileSystem() {
		return _parentFS;
	}
}
