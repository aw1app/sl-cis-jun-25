public class User {
	
	int UserID;
	String name;
	String email;
	
	
	public User() {
		
	}
	
		
	public User(int userID, String name, String email) {
		super();
		UserID = userID;
		this.name = name;
		this.email = email;
	}


	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
