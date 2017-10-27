//package ca.ciccc.madp202.InterviewerBackend.services;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//import ca.ciccc.madp202.InterviewerBackend.models.UserID;
//
//public class UsersFile implements Serializable {
//
//	/**
//	 * Create User
//	 */
//	public void outputUser(Profile pfe) {
//		try (FileOutputStream fileOutput = new FileOutputStream("userfile"); // ←this file is not exsist yet.
//				ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput)) {
//
//			// ===== Serialize object =====
//			objOutput.writeObject(pfe);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * login
//	 */
//	public void outputLogin(Credential crm) {
//		try (FileOutputStream fileOutput = new FileOutputStream("userfile"); // ←this file is not exsist yet.
//				ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput)) {
//
//			// ===== Serialize object =====
//			objOutput.writeObject(crm);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * Get interview questions
//	 */
//	public void outputQuestion(Topic topic) {
//		try (FileOutputStream fileOutput = new FileOutputStream("userfile"); // ←this file is not exsist yet.
//				ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput)) {
//
//			// ===== Serialize object =====
//			objOutput.writeObject(topic);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * history
//	 */
//	public void outputHistory(UserID userID) {
//		try (FileOutputStream fileOutput = new FileOutputStream("userfile"); // ←this file is not exsist yet.
//				ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput)) {
//
//			// ===== Serialize object =====
//			objOutput.writeObject(userID);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * Submit answers
//	 */
//	// =============================================================!!!!!!!!!!!!!!!!!!!!!!!!!!!===================================
//	public void outputAnswers(Interview interview) { // TODO interviewID and interview object or just interview object
//														// is fine??
//		try (FileOutputStream fileOutput = new FileOutputStream("userfile"); // ←this file is not exsist yet.
//				ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput)) {
//
//			// ===== Serialize object =====
//			objOutput.writeObject(interview);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//}
