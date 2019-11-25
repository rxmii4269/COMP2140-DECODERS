public class Teacher extends User {

	private String fname;
	private String lname;
	private String homeRoom;

	public String searchStudent(String result) {
		return result;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {

		this.lname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {

		this.lname = lname;
	}

	public String getHomeRoom() {

		return homeRoom;
	}

	public void setHomeRoom(String homeRoom) {
		this.homeRoom = homeRoom;
	}
	public void generateReport() {

	}
}
