import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class StudentRegistrationController {
	public Label formlabel;
	public Label EnterStudentInfoLabel;
	public TextField studentFirstName;
	public TextField studentLastName;
	public TextField studentGender;
	public TextField studentDOB;
	public TextField studentEmail;
	public TextField studentContactNum;
	public TextField studentAge;
	public TextField studentGrade;
	public TextField studentHomeRoom;
	public Button submitButton;
	public Button cancelBtn;


	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		Window owner = submitButton.getScene().getWindow();

		if (studentFirstName.getText().isEmpty() && studentLastName.getText().isEmpty() && studentGender.getText().isEmpty() && studentDOB.getText().isEmpty() && studentEmail.getText().isEmpty() &&
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
		if (studentDOB.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter student's Date of Birth");
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
		}
		AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful! ", "Saved");

	}


}
