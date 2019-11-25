public class Administration extends User {

	private String name;
	private String position;
	private String userID;
	private String password;
	private String loginStatus;

	public Administration(String user_name, String password) {
		super(user_name, password);
	}


	public void disciplinaryAction() {

	}

	public void updateStudentRecord() {

	}

	public void generateReport() {

	}

	public void searchStudent() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
}
