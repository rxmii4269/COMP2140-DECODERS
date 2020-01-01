import Database.dbConnect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

public class StudentRegistrationController {
	public Label formlabel;
	public Label EnterStudentInfoLabel;
	public TextField studentFirstName;
	public TextField studentLastName;
	public TextField studentGender;
	public DatePicker studentDOB;
	public TextField studentEmail;
	public TextField studentContactNum;
	public TextField studentAge;
	public TextField studentGrade;
	public TextField studentHomeRoom;
	public Button submitButton;
	public Button cancelBtn;
	public Button editBtn;
	public TextField parentName;
	public TextField parentAddress;
	public TextField studentAddress;
	private Window owner;
	private StudentEditController controllers = new StudentEditController();


	private boolean isValid(String email) {
		String regex = "^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}

	private boolean validateNumField(String field) {
		String regex = "^?\\d+$";
		return !field.matches(regex);

	}


	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) throws IOException, SQLException {
		owner = submitButton.getScene().getWindow();
		if (studentAddress.getText().isEmpty() && parentName.getText().isEmpty() && parentAddress.getText().isEmpty() && studentFirstName.getText().isEmpty() && studentLastName.getText().isEmpty() && studentGender.getText().isEmpty() && studentEmail.getText().isEmpty() &&
				studentContactNum.getText().isEmpty() && studentAge.getText().isEmpty() && studentGrade.getText().isEmpty() && studentHomeRoom.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Fields are empty!!");
			return;
		}
		if (studentFirstName.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter the First Name");
			studentFirstName.requestFocus();
			return;
		}
		if (studentLastName.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter Last Name");
			studentLastName.requestFocus();
			return;
		}
		if (studentGender.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter student's Gender");
			return;
		}
		if (studentContactNum.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter student's Contact Number");
			studentContactNum.requestFocus();
			return;
		}
		if (studentAge.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter student's Age");
			studentAge.requestFocus();
			return;
		}
		if (studentGrade.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter student's Form grade ");
			studentGrade.requestFocus();
			return;

		}
		if (studentHomeRoom.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter student's HomeRoom");
			studentHomeRoom.requestFocus();
			return;
		}
		if (parentName.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Parent/Guardian Field is empty");
			parentName.requestFocus();
			return;
		}
		if (studentAddress.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Student Address field is empty");
			studentAddress.requestFocus();
			return;
		}
		if (parentAddress.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Address Field is empty");
			parentAddress.requestFocus();
			return;
		}
		if (!isValid(studentEmail.getText())) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Email Doesn't not match normal format");
			studentEmail.requestFocus();
			return;
		}
		if (validateNumField(studentGrade.getText())) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Student Grade is not a valid number");
			studentGrade.requestFocus();
			return;
		}
		if (validateNumField(studentAge.getText())) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Age field doesn't contain a number");
			studentAge.requestFocus();
		} else {
			submitStudentFxmlLoader();


		}
	}

	private void EditStudentFxmlLoader() throws IOException {
		fxmlLoader();
	}

	private void submitStudentFxmlLoader() throws IOException, SQLException {
		Connection connection;
		connection = dbConnect.getConnection();
		String sql = "INSERT INTO student (name, dob, student_age, gender, contact_num, email_address, home_room, form_grade, parent_num, parent_address, student_address) " +
				"VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, studentFirstName.getText() + " " + studentLastName.getText());
			preparedStatement.setString(2, studentDOB.getValue().format(DateTimeFormatter.ofPattern("MM-d-yyyy")));
			preparedStatement.setString(3, studentAge.getText());
			preparedStatement.setString(4, studentGender.getText());
			preparedStatement.setString(5, studentContactNum.getText());
			preparedStatement.setString(6, studentEmail.getText());
			preparedStatement.setString(7, studentHomeRoom.getText());
			preparedStatement.setString(8, studentGrade.getText());
			preparedStatement.setString(9, studentContactNum.getText());
			preparedStatement.setString(10, parentAddress.getText());
			preparedStatement.setString(11, studentAddress.getText());
			preparedStatement.execute();
			AlertHelper.showAlert(Alert.AlertType.INFORMATION, owner, "Saved Changes", "Changes Have Been Saved");
		} catch (SQLException e) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Sql Error", "Changes were not saved");
			e.printStackTrace();
		}
		fxmlLoader();
	}

	private void fxmlLoader() throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/StudentEdit.fxml"));
		Stage stage = new Stage();
		stage.setTitle("Edit Student Information");
		stage.setScene(new Scene(parent));
		stage.setResizable(false);
		stage.setAlwaysOnTop(true);
		stage.show();
	}

	private void clearFields() {
		studentFirstName.clear();
		studentLastName.clear();
		studentAge.clear();
		studentContactNum.clear();
		studentGrade.clear();
		studentHomeRoom.clear();
		studentEmail.clear();
		studentGender.clear();
		studentAddress.clear();
		parentAddress.clear();
		parentName.clear();
	}

	@FXML
	protected void handleCancelButton(ActionEvent e) {
		owner = cancelBtn.getScene().getWindow();
		clearFields();
		studentFirstName.requestFocus();


	}

	@FXML
	protected void handleEditBtn() throws IOException {
		EditStudentFxmlLoader();


	}


}
