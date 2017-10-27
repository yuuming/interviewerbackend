package ca.ciccc.madp202.InterviewerBackend.models;

public class Answer {

	private String response;
	private String questionid;

	public Answer(){	}

	public Answer(String response, String questionid) {
		this.response = response;
		this.questionid = questionid;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getQuestionid() {
		return questionid;
	}

	public void setQuestionid(String questionid) {
		this.questionid = questionid;
	}

}
