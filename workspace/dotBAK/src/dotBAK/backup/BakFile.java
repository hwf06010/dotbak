package dotBAK.backup;

import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveOutputStream;

import dotBAK.filesystem.File;
import dotBAK.filesystem.FileSystem;

public class BakFile extends File {

	/**
	 * generated serial version uid
	 */
	private static final long serialVersionUID = 7089944086344965016L;

	public BakFile(String pathname) {
		super(pathname);
	}

	@Override
	public boolean write(FileSystem destination) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Object> getMetaData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void addToArchive(ArchiveOutputStream archive) {
		// NO OP
	}

	@Override
	public File[] listFiles() {
		// TODO Auto-generated method stub
		return null;
	}

}
