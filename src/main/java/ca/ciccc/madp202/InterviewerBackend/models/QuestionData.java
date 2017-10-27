package ca.ciccc.madp202.InterviewerBackend.models;

import java.util.ArrayList;
import java.util.Date;

public class QuestionData {
	public InterviewSelectionResponseModelBE javaQuestion() {

		ArrayList<Question> questions = new ArrayList<>();
		questions.add(new Question("1", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("2", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("3", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("4", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("5", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("6", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("7", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("8", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("9", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("10", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("11", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("12", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("13", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("14", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("15", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("16", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("17", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("18", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("19", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("20", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));

		return new InterviewSelectionResponseModelBE("JAVAquestion", questions, "JAVA", "20");

	}

	public InterviewSelectionResponseModelBE sqlQuestion() {

		ArrayList<Question> questions = new ArrayList<>();
		questions.add(new Question("1", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("2", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("3", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("4", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("5", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("6", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("7", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("8", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("9", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("10", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("11", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("12", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("13", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("14", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("15", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("16", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("17", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("18", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("19", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));
		questions.add(new Question("20", "What is my favorite color a: pink b: yellow c: blue d: green ", "a", "b", "c",
				"d", 4));

		return new InterviewSelectionResponseModelBE("SQLquestion", questions, "SQL", "20");
	}

	public AnswerCollectionResponseModelBE checkAnswerJava(AnswerCollectionRequestModelBE acn) {
		ArrayList<Answer> answers = new ArrayList<>();

		answers.add(new Answer("a", "1"));
		answers.add(new Answer("a", "2"));
		answers.add(new Answer("a", "3"));
		answers.add(new Answer("c", "4"));
		answers.add(new Answer("d", "5"));
		answers.add(new Answer("a", "6"));
		answers.add(new Answer("a", "7"));
		answers.add(new Answer("c", "8"));
		answers.add(new Answer("b", "9"));
		answers.add(new Answer("a", "10"));
		answers.add(new Answer("a", "11"));
		answers.add(new Answer("a", "12"));
		answers.add(new Answer("a", "13"));
		answers.add(new Answer("c", "14"));
		answers.add(new Answer("d", "15"));
		answers.add(new Answer("a", "16"));
		answers.add(new Answer("a", "17"));
		answers.add(new Answer("c", "18"));
		answers.add(new Answer("b", "19"));
		answers.add(new Answer("a", "20"));

		int correctAnswers = 0;
		int wrongAnswers = 0;
		int skippedAnswers = 0;

		for (int i = 0; i < acn.getResponses().size(); i++) {
			if (acn.getResponses().get(i).getResponse().equals("s")) {
				skippedAnswers++;
				wrongAnswers++;
			} else if (!answers.get(i).getResponse().equals(acn.getResponses().get(i).getResponse())) {
				wrongAnswers++;
			} else if (answers.get(i).getResponse().equals(acn.getResponses().get(i).getResponse())) {
				correctAnswers++;
			}
		}
		return new AnswerCollectionResponseModelBE(20, skippedAnswers, wrongAnswers, acn.getInterviewID(),
				correctAnswers * 5, correctAnswers, acn.getDate());
	}

	public AnswerCollectionResponseModelBE checkAnswerSql(AnswerCollectionRequestModelBE acn) {
		ArrayList<Answer> answers = new ArrayList<>();

		answers.add(new Answer("a", "1"));
		answers.add(new Answer("a", "2"));
		answers.add(new Answer("a", "3"));
		answers.add(new Answer("c", "4"));
		answers.add(new Answer("d", "5"));
		answers.add(new Answer("a", "6"));
		answers.add(new Answer("a", "7"));
		answers.add(new Answer("c", "8"));
		answers.add(new Answer("b", "9"));
		answers.add(new Answer("a", "10"));
		answers.add(new Answer("a", "11"));
		answers.add(new Answer("a", "12"));
		answers.add(new Answer("a", "13"));
		answers.add(new Answer("c", "14"));
		answers.add(new Answer("d", "15"));
		answers.add(new Answer("a", "16"));
		answers.add(new Answer("a", "17"));
		answers.add(new Answer("c", "18"));
		answers.add(new Answer("b", "19"));
		answers.add(new Answer("a", "20"));

		int correctAnswers = 0;
		int wrongAnswers = 0;
		int skippedAnswers = 0;

		for (int i = 0; i < acn.getResponses().size(); i++) {
			if (acn.getResponses().get(i).getResponse().equals("s")) {
				skippedAnswers++;
				wrongAnswers++;
			} else if (!answers.get(i).getResponse().equals(acn.getResponses().get(i).getResponse())) {
				wrongAnswers++;
			} else if (answers.get(i).getResponse().equals(acn.getResponses().get(i).getResponse())) {
				correctAnswers++;
			}
		}
		return new AnswerCollectionResponseModelBE(20, skippedAnswers, wrongAnswers, acn.getInterviewID(),
				correctAnswers * 5, correctAnswers, acn.getDate());
	}
}
