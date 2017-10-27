//package ca.ciccc.madp202.InterviewerBackend.services;
//
//import java.sql.*;
//import ca.ciccc.madp202.InterviewerBackend.models.CredentialResponseModelBE;
//import ca.ciccc.madp202.InterviewerBackend.models.UserRequestModelBE;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class UserService {
//
//	Connection con = null;
//	Statement st = null;
//	ResultSet rs = null;
//	CredentialResponseModelBE profileResponse = new CredentialResponseModelBE();
//
//	String url = "jdbc:mysql://localhost:3306/interviewer?autoReconnect=true&useSSL=false";
//	String id = "root";
//	String password = "yuumi";
//
//	public void insertUser(UserRequestModelBE user) {
//
//		try {
//			Class.forName("org.gjt.mm.mysql.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//
//			con = DriverManager.getConnection(url, id, password);
//			st = con.createStatement();
//
//			String sql = "INSERT INTO users (id,firstName, lastName, username, country,joined,token) "
//					+ "VALUES('" + user.getFirstName() + "','" + user.getLastName() + "','" + user.getCountry() + "','"
//					+ user.getUserName() + "','2017-08-26')";
//			
//			rs = st.executeQuery("SELECT * FROM users;" + sql);
//
//			st.execute(sql);
//
//		} catch (SQLException ex) {
//
//			Logger lgr = Logger.getLogger(UserService.class.getName());
//			lgr.log(Level.SEVERE, ex.getMessage(), ex);
//
//		} finally {
//			try {
//				con.close();
//				st.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//	}
//
//	public CredentialResponseModelBE assignUserID(UserRequestModelBE user, CredentialResponseModelBE profileResponse) {
//
//		try {
//			Class.forName("org.gjt.mm.mysql.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			con = DriverManager.getConnection(url, id, password);
//			st = con.createStatement();
//			rs = st.executeQuery("SELECT * FROM users");
//
//			while (rs.next()) {
//				if (rs.getString(4).equals(user.getUserName())) {
//					profileResponse.setUserId(rs.getInt(1));
//
//				}
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return profileResponse;
//	}
//}
