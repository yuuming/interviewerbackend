package ca.ciccc.madp202.InterviewerBackend.models;

public class UserRequestModelBE{
	private String firstName;
	private String lastName;
	private String country;
	private String userName;
	private String password;
	
	public UserRequestModelBE() {
		
	}
	
	public UserRequestModelBE(String firstName, String lastName, String country, String userName, String password) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.userName = userName;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	
	
	
}
