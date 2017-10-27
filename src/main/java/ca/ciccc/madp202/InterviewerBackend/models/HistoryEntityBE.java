package ca.ciccc.madp202.InterviewerBackend.models;

import java.util.Date;

public class HistoryEntityBE {
	private String title;
	private Date date;
	private int score;
	
	public HistoryEntityBE() {

	}

	public HistoryEntityBE(String title, Date date, int score) {
		this.title = title;
		this.date = date;
		this.score = score;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}	
}
