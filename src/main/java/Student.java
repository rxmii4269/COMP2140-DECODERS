public class Student {

	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String gender;
	private String contactNum;
	private String homeRoom;
	private String studentAge;
	private String studentGrade;
	private String parentAddress;
	private String parentName;
	private String DOB;
	private String studentAddress;


	public Student(String firstName, String lastName, String studentGender,
	               String studentDOB, String studentEmail, String studentContactNum,
	               String studentAge, String studentGrade, String studentHomeRoom,
	               String parentName, String parentAddress, String studentAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = studentGender;
		this.email = studentEmail;
		this.DOB = studentDOB;
		this.studentAge = studentAge;
		this.studentGrade = studentGrade;
		this.parentAddress = parentAddress;
		this.contactNum = studentContactNum;
		this.parentName = parentName;
		this.studentAddress = studentAddress;
		this.homeRoom = studentHomeRoom;
	}


	public void Register() {

	}

	public String getName() {
		return firstName;
	}

	public void setName(String name) {
		this.firstName = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getHomeRoom() {
		return homeRoom;
	}

	public void setHomeRoom(String homeRoom) {
		this.homeRoom = homeRoom;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getParentAddress() {
		return parentAddress;
	}

	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
}
