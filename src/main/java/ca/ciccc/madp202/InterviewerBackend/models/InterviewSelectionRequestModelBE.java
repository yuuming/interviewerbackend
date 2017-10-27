package ca.ciccc.madp202.InterviewerBackend.models;

public class InterviewSelectionRequestModelBE {

	private String topic;

	
	public InterviewSelectionRequestModelBE() {
	}

	public InterviewSelectionRequestModelBE(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}
