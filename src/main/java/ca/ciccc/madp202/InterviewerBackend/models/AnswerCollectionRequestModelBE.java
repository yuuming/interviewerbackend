package ca.ciccc.madp202.InterviewerBackend.models;

import java.util.ArrayList;
import java.util.Date;

public class AnswerCollectionRequestModelBE {
	private String interviewID;
	private Date date;
	private int userID;
	ArrayList<Answer> responses;
	
	public AnswerCollectionRequestModelBE() {
		
	}
	
	public AnswerCollectionRequestModelBE(String interviewID, Date date, int userID, ArrayList<Answer> responses) {

		this.interviewID = interviewID;
		this.date = date;
		this.userID = userID;
		this.responses = responses;
	}


	public String getInterviewID() {
		return interviewID;
	}

	public void setInterviewID(String interviewID) {
		this.interviewID = interviewID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public ArrayList<Answer> getResponses() {
		return responses;
	}

	public void setResponses(ArrayList<Answer> responses) {
		this.responses = responses;
	}
	
}
