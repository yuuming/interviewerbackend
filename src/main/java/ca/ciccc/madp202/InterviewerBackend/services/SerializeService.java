package ca.ciccc.madp202.InterviewerBackend.services;

import java.util.ArrayList;

import ca.ciccc.madp202.InterviewerBackend.models.HistoryResponseModelBE;
import ca.ciccc.madp202.InterviewerBackend.models.Results;
import ca.ciccc.madp202.InterviewerBackend.models.User;

import java.io.*;

public class SerializeService {

	/**
	 * users
	 */
	// ====serialize====
	public void insertUser(ArrayList<User> users) {

		try {
			FileOutputStream fos = new FileOutputStream("userfile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(users);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	// ====deserialize====
	// return ArrayList<User> to interviewResouce so that we can find user is exsist
	// or not and add a new user as well.

	public ArrayList<User> getUser() {
		ArrayList<User> userList = new ArrayList<User>();
		try {
			FileInputStream fis = new FileInputStream("userfile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			userList = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
		}
		for (User tmp : userList) {
			System.out.println(tmp.getFirstName() + tmp.getLastName() + tmp.getCountry());
		}
		return userList;
	}

	
	/**
	 * Jaewon's try
	 */
	// ====serialize====
	public void insertHistory(ArrayList<Results> resultList) {

		try {
			FileOutputStream fos = new FileOutputStream("resultfile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(resultList);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	
//	/**
//	 * history
//	 */
//	// ====serialize====
//	public void insertHistory(Results results) {
//
//		try {
//			FileOutputStream fos = new FileOutputStream("resultfile");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(results);
//			oos.close();
//			fos.close();
//		} catch (IOException ioe) {
//			ioe.printStackTrace();
//		}
//	}

	// ====deserialize====
	
	

	

	public ArrayList<Results> getHistory() {
		ArrayList<Results> historyList = new ArrayList<Results>();
		try {
			FileInputStream fis = new FileInputStream("resultfile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			historyList = (ArrayList<Results>) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
		}
	
		return historyList;
	}

}
