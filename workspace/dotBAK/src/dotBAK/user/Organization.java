package dotBAK.user;

import java.io.IOException;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import dotBAK.common.UIDGenerator;
import dotBAK.filesystem.File;
import dotBAK.filesystem.FileSystem;

public class Organization {

	private final int _id;
	private Set<User> _users;
	private Set<User> _admins;
	private Set<FileSystem> _cloudFSs;
	private String _name;
	

	public static Organization getInstance(int id, String name){
		return new Organization(id, name);
	}
	
	private Organization(int id, String name){
		_id = id;
		_name = name;
	}
	
	public String getUID() {
		return UIDGenerator.ORG_PREFIX + _id;
	}
	
	public String getName() {
		return _name;
	}
	
	public Set<User> getUsers(){
		return _users;
	}
	
	public Set<User> getAdmins(){
		return _admins;
	}
	
	public Set<FileSystem> getFileSystems(){
		return _cloudFSs;
	}
	
	public void addUser(User user) {
		_users.add(user);
	}
	
	public void removeUser(User user) {
		_users.remove(user);
	}

	public void addFileSystem(FileSystem fs) {
		_cloudFSs.add(fs);
	}
	
	public void removeFileSystem(FileSystem fs) {
		_cloudFSs.remove(fs);
	}

	public void makeAdmin(User user) {
		_admins.add(user);

	}
	
	public void removeAdmin(User user) {
		_admins.remove(user);
	}

	public void changePermission(User user, Permission p, Boolean b) {
		user.changePermission(p, b);
		//user.getPermissions().changePermission(p, b); // which one of these do we care about?
	}

	public static Organization restore(File orgXML) throws ParserConfigurationException, SAXException, IOException { 
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(orgXML);
		doc.getDocumentElement().normalize();
		NodeList orgs = doc.getElementsByTagName("org");
		Element orgElem = (Element) orgs.item(0);
		Attr uid = orgElem.getAttributeNode("uid");
		int id = Integer.parseInt(uid.getValue().substring(UIDGenerator.ORG_PREFIX.length()));
		String name = orgElem.getAttributeNode("name").getValue();		
		// import organization's users, currently don't factor in admin role
		NodeList userNodes = doc.getElementsByTagName("user");
		Organization org = getInstance(id, name);
		for(int i = 0; i < userNodes.getLength(); i++) {
			Element user = (Element) userNodes.item(i);
			org.addUser(User.restore(user, org));
		}
		return org;
	}

	public void export(File f) {

		return;
	}
}

