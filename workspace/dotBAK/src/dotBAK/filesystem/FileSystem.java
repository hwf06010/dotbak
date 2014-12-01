package dotBAK.filesystem;

import java.util.Set;

import dotBAK.backup.BakFile;

public abstract class FileSystem {
	private FileTree _files;
	private Set<BakFile> _bakFiles;
	
	public FileTree getFileTree() {
		return _files;
	}
	
	public Set<BakFile> getBakFiles() {
		return _bakFiles;
	}

	public abstract void log(String string);
}
