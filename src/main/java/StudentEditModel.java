import javafx.beans.property.SimpleStringProperty;

public class StudentEditModel {
	private SimpleStringProperty firstname;
	private SimpleStringProperty lastname;
	private SimpleStringProperty gender;
	private SimpleStringProperty dob;
	private SimpleStringProperty age;
	private SimpleStringProperty emergencyContact;
	private SimpleStringProperty email;
	private SimpleStringProperty grade;
	private SimpleStringProperty homeroom;
	private SimpleStringProperty parent;
	private SimpleStringProperty parentAddress;
	private SimpleStringProperty studentAddress;


//	StudentEditModel(String firstname, String lastname, String gender, String dob, String age,
//	                 String emergencyContact, String email, String grade, String homeroom, String parent,
//	                 String parentAddress, String studentAddress) {
//		this.firstname = new SimpleStringProperty(firstname);
//		this.lastname = new SimpleStringProperty(lastname);
//		this.gender = new SimpleStringProperty(gender);
//		this.dob = new SimpleStringProperty(dob);
//		this.age = new SimpleStringProperty(age);
//		this.emergencyContact = new SimpleStringProperty(emergencyContact);
//		this.email = new SimpleStringProperty(email);
//		this.grade = new SimpleStringProperty(grade);
//		this.homeroom = new SimpleStringProperty(homeroom);
//		this.parent = new SimpleStringProperty(parent);
//		this.parentAddress = new SimpleStringProperty(parentAddress);
//		this.studentAddress = new SimpleStringProperty(studentAddress);
//
//	}





	public String getFirstName() {
		return firstname.get();
	}


	public void setFirstName(String firstname) {
		this.firstname = new SimpleStringProperty(firstname);
	}

	public String getLastName() {
		return lastname.get();
	}


	public void setLastname(String lastname) {
		this.lastname = new SimpleStringProperty(lastname);
	}

	public String getGender() {
		return gender.get();
	}

	public void setGender(String gender) {
		this.gender.set(gender);
	}

	public SimpleStringProperty genderProperty() {
		return gender;
	}

	public String getDob() {
		return dob.get();
	}

	public void setDob(String dob) {
		this.dob.set(dob);
	}

	public SimpleStringProperty dobProperty() {
		return dob;
	}

	public String getAge() {
		return age.get();
	}

	public void setAge(String age) {
		this.age.set(age);
	}

	public SimpleStringProperty ageProperty() {
		return age;
	}

	public String getEmergencyContact() {
		return emergencyContact.get();
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact.set(emergencyContact);
	}

	public SimpleStringProperty emergencyContactProperty() {
		return emergencyContact;
	}

	public String getEmail() {
		return email.get();
	}

	public void setEmail(String email) {
		this.email.set(email);
	}

	public SimpleStringProperty emailProperty() {
		return email;
	}

	public String getGrade() {
		return grade.get();
	}

	public void setGrade(String grade) {
		this.grade.set(grade);
	}

	public SimpleStringProperty gradeProperty() {
		return grade;
	}

	public String getHomeroom() {
		return homeroom.get();
	}

	public void setHomeroom(String homeroom) {
		this.homeroom.set(homeroom);
	}

	public SimpleStringProperty homeroomProperty() {
		return homeroom;
	}

	public String getParent() {
		return parent.get();
	}

	public void setParent(String parent) {
		this.parent.set(parent);
	}

	public SimpleStringProperty parentProperty() {
		return parent;
	}

	public String getParentAddress() {
		return parentAddress.get();
	}

	public void setParentAddress(String parentAddress) {
		this.parentAddress.set(parentAddress);
	}

	public SimpleStringProperty parentAddressProperty() {
		return parentAddress;
	}

	public String getStudentAddress() {
		return studentAddress.get();
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress.set(studentAddress);
	}

	public SimpleStringProperty studentAddressProperty() {
		return studentAddress;
	}
}
