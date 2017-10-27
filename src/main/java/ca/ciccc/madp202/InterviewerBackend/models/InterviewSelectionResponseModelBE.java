package ca.ciccc.madp202.InterviewerBackend.models;

import java.util.ArrayList;


public class InterviewSelectionResponseModelBE {

	private String interviewID;
	private ArrayList<Question> questions;
	private String topic;
	private String duration;
	
	public InterviewSelectionResponseModelBE() {
	}

	public InterviewSelectionResponseModelBE(String interviewID, ArrayList<Question> questions, String topic,
			String duration) {
		
		this.interviewID = interviewID;
		this.questions = questions;
		this.topic = topic;
		this.duration = duration;
	}

	public String getInterviewID() {
		return interviewID;
	}

	public void setInterviewID(String interviewID) {
		this.interviewID = interviewID;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	
}
