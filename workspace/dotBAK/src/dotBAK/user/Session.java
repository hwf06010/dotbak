package dotBAK.user;

import dotBAK.backup.Schedule;

public class Session {
	
	private User _user;
	private Schedule _killSchedule;
	
	public Session(User user) {
		_user = user;
		_killSchedule = Schedule.forSession();
	}
	
	public void kill(){
		_user.auth(null, null);
	}
	
	public User getUser() {
		return _user;
	}

	public void setUser(User user) {
		_user = user;
	}
	
	public Schedule getKillSchedule() {
		return _killSchedule;
	}
}

