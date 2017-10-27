//package ca.ciccc.madp202.InterviewerBackend.services;
//
//=====================================================================================================
//                     I tried to use DataBase my sql for this project but I fail. so I will revenge next time with this class
//======================================================================================================
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import ca.ciccc.madp202.InterviewerBackend.models.CredentialResponseModelBE;
//import ca.ciccc.madp202.InterviewerBackend.models.UserRequestModelBE;
//
//public class LoginService {
//	Connection con = null;
//	Statement st = null;
//	ResultSet rs = null;
//	CredentialResponseModelBE profileResponse = new CredentialResponseModelBE();
//
//	String url = "jdbc:mysql://localhost:3306/interviewer?autoReconnect=true&useSSL=false";
//	String id = "root";
//	String password = "yuumi";
//
//	public void addUser(UserRequestModelBE user) {
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
//			rs = st.executeQuery("SELECT * FROM users");
//
//			String sql = "INSERT INTO users (firstName, lastName, userName, country, joined) VALUES('"
//					+ user.getFirstName() + "','" + user.getLastName() + "','" + user.getCountry() + "','"
//					+ user.getUserName() + "','2017-08-26')";
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
//			rs = st.executeQuery("SELECT * from users");
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
//
//}
