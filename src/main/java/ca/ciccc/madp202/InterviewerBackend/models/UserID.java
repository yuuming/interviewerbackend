package ca.ciccc.madp202.InterviewerBackend.models;

public class UserID {
	private int userId;

	public UserID(int userId) {
		this.userId = userId;
	}

	public UserID() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
