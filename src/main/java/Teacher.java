import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Teacher {

	private final StringProperty ID;
	private final StringProperty firstName;
	private final StringProperty lastName;
	private final StringProperty email;
	private final StringProperty DOB;
	private final StringProperty homeRoom;

	public Teacher(String id, String firstName, String lastName, String email, String dob, String homeRoom) {
		this.ID = new SimpleStringProperty(id);
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		this.email = new SimpleStringProperty(email);
		this.DOB = new SimpleStringProperty(dob);
		this.homeRoom = new SimpleStringProperty(homeRoom);

	}

	public String getID() {
		return ID.get();
	}

	public StringProperty IDProperty() {
		return ID;
	}

	public void setID(String ID) {
		this.ID.set(ID);
	}

	public String getFirstName() {
		return firstName.get();
	}

	public StringProperty firstNameProperty() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}

	public String getLastName() {
		return lastName.get();
	}

	public StringProperty lastNameProperty() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}

	public String getEmail() {
		return email.get();
	}

	public StringProperty emailProperty() {
		return email;
	}

	public void setEmail(String email) {
		this.email.set(email);
	}

	public String getDOB() {
		return DOB.get();
	}

	public StringProperty DOBProperty() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB.set(DOB);
	}

	public String getHomeRoom() {
		return homeRoom.get();
	}

	public StringProperty homeRoomProperty() {
		return homeRoom;
	}

	public void setHomeRoom(String homeRoom) {
		this.homeRoom.set(homeRoom);
	}

}

