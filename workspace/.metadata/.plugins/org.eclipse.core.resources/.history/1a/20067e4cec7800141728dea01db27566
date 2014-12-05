package dotBAK.filesystem;

import java.util.Set;

public abstract class File extends java.io.File{

	private Set<File> _subFiles;
	
	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -4193129239531496107L;

	public File(String pathname) {
		super(pathname);
	}
	
	public boolean isDirectory() {
		return _subFiles != null;
	}
}
