package ca.ciccc.madp202.InterviewerBackend.models;

import java.io.Serializable;
import java.util.Date;

public class Results implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int userId;
	private String title;
	private Date date;
	private int score;

	public Results() {
	}

	public Results(int userId, String title, Date date, int score) {
		this.userId = userId;
		this.title = title;
		this.date = date;
		this.score = score;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
