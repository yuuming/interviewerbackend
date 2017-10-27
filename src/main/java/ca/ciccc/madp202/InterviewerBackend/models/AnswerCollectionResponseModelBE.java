package ca.ciccc.madp202.InterviewerBackend.models;

import java.util.Date;

public class AnswerCollectionResponseModelBE {
	private int total;
	private int skipped;
	private int wrong;
	private String intervieID;
	private int score;
	private int correct;
	private Date date;

	public AnswerCollectionResponseModelBE() {
		
	}
	public AnswerCollectionResponseModelBE(int total, int skipped, int wrong, String intervieID, int score, int correct,
			Date date) {
	
		this.total = total;
		this.skipped = skipped;
		this.wrong = wrong;
		this.intervieID = intervieID;
		this.score = score;
		this.correct = correct;
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSkipped() {
		return skipped;
	}

	public void setSkipped(int skipped) {
		this.skipped = skipped;
	}

	public int getWrong() {
		return wrong;
	}

	public void setWrong(int wrong) {
		this.wrong = wrong;
	}

	public String getIntervieID() {
		return intervieID;
	}

	public void setIntervieID(String intervieID) {
		this.intervieID = intervieID;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getCorrect() {
		return correct;
	}

	public void setCorrect(int correct) {
		this.correct = correct;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
