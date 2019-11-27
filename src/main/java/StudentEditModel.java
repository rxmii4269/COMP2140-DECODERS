import javafx.beans.property.SimpleStringProperty;

public class StudentEditModel {

	private SimpleStringProperty firstname;
	private SimpleStringProperty lastname;
	private SimpleStringProperty gender;
	private SimpleStringProperty dob;
	private SimpleStringProperty age;
	private SimpleStringProperty Emergencycontact;
	private SimpleStringProperty email;
	private SimpleStringProperty grade;
	private SimpleStringProperty homeroom;


	StudentEditModel(String firstname, String lastname, String gender, String dob, String age,
	                 String emergencyContact, String email, String grade, String homeroom) {
		this.firstname = new SimpleStringProperty(firstname);
		this.lastname = new SimpleStringProperty(lastname);
		this.gender = new SimpleStringProperty(gender);
		this.dob = new SimpleStringProperty(dob);
		this.age = new SimpleStringProperty(age);
		this.Emergencycontact = new SimpleStringProperty(emergencyContact);
		this.email = new SimpleStringProperty(email);
		this.grade = new SimpleStringProperty(grade);
		this.homeroom = new SimpleStringProperty(homeroom);

	}

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

	public String getEmergencycontact() {
		return Emergencycontact.get();
	}

	public void setEmergencycontact(String emergencycontact) {
		this.Emergencycontact.set(emergencycontact);
	}

	public SimpleStringProperty emergencycontactProperty() {
		return Emergencycontact;
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
}
