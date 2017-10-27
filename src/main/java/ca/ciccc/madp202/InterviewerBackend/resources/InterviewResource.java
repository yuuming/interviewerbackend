package ca.ciccc.madp202.InterviewerBackend.resources;

import java.util.ArrayList;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ca.ciccc.madp202.InterviewerBackend.models.AnswerCollectionRequestModelBE;
import ca.ciccc.madp202.InterviewerBackend.models.CredentialRequestModelBE;
import ca.ciccc.madp202.InterviewerBackend.models.HistoryEntityBE;
import ca.ciccc.madp202.InterviewerBackend.models.Results;
import ca.ciccc.madp202.InterviewerBackend.models.HistoryResponseModelBE;
import ca.ciccc.madp202.InterviewerBackend.models.InterviewSelectionResponseModelBE;
import ca.ciccc.madp202.InterviewerBackend.models.UserRequestModelBE;
import ca.ciccc.madp202.InterviewerBackend.models.CredentialResponseModelBE;
import ca.ciccc.madp202.InterviewerBackend.models.QuestionData;
import ca.ciccc.madp202.InterviewerBackend.models.User;
import ca.ciccc.madp202.InterviewerBackend.models.AnswerCollectionResponseModelBE;
import ca.ciccc.madp202.InterviewerBackend.services.SerializeService;

@Path("interview")
public class InterviewResource {
	SerializeService serializeService = new SerializeService();

	/**
	 * Create user
	 */
	@POST
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public CredentialResponseModelBE postUser(UserRequestModelBE urm) {
		ArrayList<User> users = serializeService.getUser();
		if (users == null)
			users = new ArrayList<>();

		// make object for sirialization
		User user1 = new User(urm.getFirstName(), urm.getLastName(), users.size() + 1, urm.getUserName(),
				urm.getCountry(), new Date(), "XBD455Xncdd1345uii33Nccd", urm.getPassword());
		// <------ desirialization-----> get userArraylists
		users.add(user1);

		// <------ sirialization-------> get insert new user to userfile
		serializeService.insertUser(users);
		CredentialResponseModelBE prs = new CredentialResponseModelBE(user1.getFirstName(), user1.getLastName(),
				user1.getUserId(), user1.getUsername(), user1.getCountry(), user1.getJoined(), user1.getToken());
		return prs;
	}

	/**
	 * Login
	 */
	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public CredentialResponseModelBE postLogin(CredentialRequestModelBE crm) {
		ArrayList<User> users = serializeService.getUser();
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);

			if (user.getUsername().equals(crm.getUsername())) {
				if (user.getPassword().equals(crm.getPassword())) {
					return new CredentialResponseModelBE(user.getFirstName(), user.getLastName(), user.getUserId(),
							user.getUsername(), user.getCountry(), user.getJoined(), user.getToken());
				} else {
					return new CredentialResponseModelBE(user.getFirstName(), user.getLastName(), user.getUserId(),
							user.getUsername(), user.getCountry(), user.getJoined(), "ERROR");
				}
			} else {
				System.out.println("both NG");
			}
		}
		return null;
	}

	/**
	 * Get interview questions
	 */
	@GET
	@Path("/topics/{interviewtopic}")
	@Produces(MediaType.APPLICATION_JSON)
	public InterviewSelectionResponseModelBE getInterview(@PathParam("interviewtopic") String topic) {
		System.out.println("Topic get interview arrived" + topic);
		QuestionData questionData = new QuestionData();
		InterviewSelectionResponseModelBE irmb;

		if (topic.equals("JAVA")) {
			irmb = questionData.javaQuestion();
		} else {
			irmb = questionData.sqlQuestion();
		}
		return irmb;
	}

	/*
	 * submit Answers
	 */
	@POST
	@Path("/interview/{interview_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public AnswerCollectionResponseModelBE submitAnswers(@PathParam("interview_id") String id,
			AnswerCollectionRequestModelBE acn) {
		System.out.println("submitAnswers " + acn.getDate());
		AnswerCollectionResponseModelBE acrsm = new AnswerCollectionResponseModelBE();

		QuestionData ad = new QuestionData();
		if (acn.getInterviewID().equals("JAVAquestion")) {
			System.out.println("=================JAVA=================");
			acrsm = ad.checkAnswerJava(acn);

		} else if (acn.getInterviewID().equals("SQLquestion")) {
			System.out.println("=================SQL=================");
			acrsm = ad.checkAnswerSql(acn);

		}

		ArrayList<Results> resultsList = serializeService.getHistory();
		if (resultsList == null)
			resultsList = new ArrayList<>();

		Results result1 = new Results(acn.getUserID(), acrsm.getIntervieID(), acrsm.getDate(), acrsm.getScore());
		resultsList.add(result1);

		System.out.println(
				"the number of elements in the ResultsList is " + resultsList.size() + " DATE " + result1.getDate());

		// <------ Sirialization------->

		serializeService.insertHistory(resultsList);

		System.out.println("is it working?");

		return acrsm;
	}

	@GET
	@Path("/history/users/{userID}")
	@Produces(MediaType.APPLICATION_JSON)
	public HistoryResponseModelBE getHistory(@PathParam("userID") int userID) {
		HistoryResponseModelBE hrmbe = new HistoryResponseModelBE();
		System.out.println(userID);
		HistoryEntityBE hrbe = new HistoryEntityBE();
		ArrayList<HistoryEntityBE> historyEntities = new ArrayList<HistoryEntityBE>();
		// <------ desirialization----->
		ArrayList<Results> results = serializeService.getHistory();

		for (int i = 0; i < results.size(); i++) {
			if ((results.get(i).getUserId()) == userID) {
				historyEntities.add(new HistoryEntityBE(results.get(i).getTitle(), results.get(i).getDate(),
						results.get(i).getScore()));
				System.out.println(results.get(i).getUserId() + "is id of this user (history backend) " + " "
						+ results.get(i).getTitle() + " " + results.get(i).getDate() + results.get(i).getScore() + " "
						+ results.get(i).getUserId());
			}

		}
		hrmbe.setHistoryRecords(historyEntities);
		return hrmbe;
	}
}
