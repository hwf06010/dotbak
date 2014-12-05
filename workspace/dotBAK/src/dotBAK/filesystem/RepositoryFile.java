package dotBAK.filesystem;

import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveOutputStream;

public class RepositoryFile extends File {

	/**
	 * generated serial version uid
	 */
	private static final long serialVersionUID = 1L;

	public RepositoryFile(String pathname) {
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
		//NO OP
	}

}
