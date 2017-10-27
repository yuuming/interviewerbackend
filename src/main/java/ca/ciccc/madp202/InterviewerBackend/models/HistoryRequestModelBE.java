package ca.ciccc.madp202.InterviewerBackend.models;

public class HistoryRequestModelBE {

	private int userID;
	
	public HistoryRequestModelBE() {
	
	}

	public HistoryRequestModelBE(int userID) {

		this.userID = userID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
}
