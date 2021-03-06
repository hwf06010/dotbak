package dotBAK.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import dotBAK.filesystem.File;

public class UIDGenerator {
	public static final String USER_PREFIX = "U";
	public static final String ORG_PREFIX = "O";
	public static final String FILE_PREFIX = "F";
	public static final String BACKUP_PREFIX = "B";
	
	private int _nextUser;
	private int _nextOrg;
	private int _nextFile;
	private int _nextBackup;
	
	private UIDGenerator(File uidRecord) throws IOException {
		uidRecord.delete();
		uidRecord.createNewFile();
		BufferedReader br = new BufferedReader(new FileReader(uidRecord));
		String line;
		while ((line = br.readLine()) != null) {
			if(line.matches(USER_PREFIX))
				_nextUser = Integer.parseInt(line.substring(USER_PREFIX.length()));
			else if(line.matches(ORG_PREFIX))
				_nextOrg = Integer.parseInt(line.substring(ORG_PREFIX.length()));
			else if(line.matches(FILE_PREFIX))
				_nextFile = Integer.parseInt(line.substring(FILE_PREFIX.length()));
			else if(line.matches(BACKUP_PREFIX))
				_nextBackup = Integer.parseInt(line.substring(BACKUP_PREFIX.length()));
		}
		br.close();
	}
	
	private UIDGenerator() {
		_nextUser = 1;
		_nextOrg = 1;
		_nextFile = 1;
		_nextBackup = 1;
	}
	
	public int getNext(String prefix) {
		if(prefix.equals(USER_PREFIX))
			return _nextUser;
		if(prefix.equals(ORG_PREFIX))
			return _nextOrg;
		if(prefix.equals(FILE_PREFIX))
			return _nextFile;
		if(prefix.equals(BACKUP_PREFIX))
			return _nextBackup;
		return -1;
	}
	
	public void export(File uidRecord) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(uidRecord));
		bw.write(USER_PREFIX + _nextUser + "\n");
		bw.write(ORG_PREFIX + _nextOrg + "\n");
		bw.write(FILE_PREFIX + _nextFile + "\n");
		bw.write(BACKUP_PREFIX + _nextBackup + "\n");
		bw.flush();
		bw.close();
	}
	
	public static UIDGenerator restore(File uidRecord) {
		try {
			return new UIDGenerator(uidRecord);
		} catch (IOException e) {
			return new UIDGenerator();
		}
	}
}
