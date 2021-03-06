package dotBAK.user;

import java.util.HashMap;
import java.util.Map;


import dotBAK.filesystem.File;


public class PermissionSet {

	// set to true for missing permissions to be treated as false, otherwise they'll be treated as true
	private static final boolean safePerms = false;
	
	private Map<Permission, Boolean> _perms;
	private Map<Permission, Map<File, Boolean>> _filePerms;
		
	public static PermissionSet getInstance(Map<Permission, Boolean> perms, Map<Permission, Map<File, Boolean>> filePerms){
		return new PermissionSet(perms, filePerms);
	}
	
	private PermissionSet(Map<Permission, Boolean> perms, Map<Permission, Map<File, Boolean>> filePerms){
		_perms = perms;
		_filePerms = filePerms;
	}

	public boolean getPermission(Permission perm){
		if(_perms.get(perm) != null)
			return _perms.get(perm);
		else
			return !safePerms;
	}
	
	public boolean getPermission(Permission perm, File file){
		if(_filePerms.get(perm) != null && _filePerms.get(perm).get(file) != null)
			return _filePerms.get(perm).get(file);
		else
			return !safePerms;
	}
	
	public void changePermission(Permission perm, Boolean can){
		_perms.put(perm, can);
	
	}
	
	public void changePermission(File file, Permission perm , Boolean can){
		if(!_filePerms.containsKey(perm)) {
			Map<File, Boolean> inner = new HashMap<File, Boolean>();
			_filePerms.put(perm, inner);
		}
		_filePerms.get(perm).put(file, can);
		
	}
}

