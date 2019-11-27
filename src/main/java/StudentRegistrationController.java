import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

import java.io.IOException;

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
	private Stage stage = new Stage(StageStyle.DECORATED);
	private Parent parent;
	private Window owner;


	private boolean isValid(String email) {
		String regex = "^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}

	private boolean validateNumField(String field) {
		String regex = "^?\\d+$";
		return !field.matches(regex);

	}


	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		owner = submitButton.getScene().getWindow();
		if (studentAddress.getText().isEmpty() && parentName.getText().isEmpty() && parentAddress.getText().isEmpty() && studentFirstName.getText().isEmpty() && studentLastName.getText().isEmpty() && studentGender.getText().isEmpty() && studentEmail.getText().isEmpty() &&
				studentContactNum.getText().isEmpty() && studentAge.getText().isEmpty() && studentGrade.getText().isEmpty() && studentHomeRoom.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Fields are empty!!");
			return;
		}
		if (studentFirstName.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter the First Name");
			return;
		}
		if (studentLastName.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter Last Name");
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
			return;
		}
		if (studentAge.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter student's Age");
			return;
		}
		if (studentGrade.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter student's Form grade ");
			return;
		}
		if (studentHomeRoom.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter student's HomeRoom");
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
			return;
		}
		if (validateNumField(studentGrade.getText())) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Student Grade is not a valid number");
			return;
		}
		if (validateNumField(studentAge.getText())) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Age field doesn't contain a number");
		} else {
			AlertHelper.showAlert(Alert.AlertType.INFORMATION, owner, "Registration Successful! ", "Saved");


		}
	}

	@FXML
	protected void handleCancelButton(ActionEvent e) {
		owner = cancelBtn.getScene().getWindow();


	}

	@FXML
	protected void handleEditBtn() throws IOException {
		parent = FXMLLoader.load(getClass().getResource("/fxml/StudentEdit.fxml"));
		stage = new Stage(StageStyle.UNDECORATED);
		stage.setTitle("Edit Student Information");
		stage.setScene(new Scene(parent));
		stage.setResizable(false);
		stage.setAlwaysOnTop(true);
		stage.show();


	}



}
