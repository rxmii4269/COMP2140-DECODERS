import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.control.cell.TextFieldTableCell.forTableColumn;

public class StudentEditController implements Initializable {

	public TableView<StudentEditModel> editTable;
	public TableColumn<StudentEditModel, String> firstNameColumn;
	public TableColumn<StudentEditModel, String> lastNameColumn;
	public TableColumn<StudentEditModel, String> genderColumn;
	public TableColumn<StudentEditModel, String> dobColumn;
	public TableColumn<StudentEditModel, String> ageColumn;
	public TableColumn<StudentEditModel, String> contactColumn;
	public TableColumn<StudentEditModel, String> emailColumn;
	public TableColumn<StudentEditModel, String> gradeColumn;
	public TableColumn<StudentEditModel, String> homeRoomColumn;
	public Button cancelBtn;
	public Button finishBtn;
	public TableColumn<StudentEditModel, String> parentName;
	public TableColumn<StudentEditModel, String> parentAddress;
	public TableColumn<StudentEditModel, String> studentAddress;
	private Parent parent;
	private Window owner;
	private Stage stage;
	private ObservableList<StudentEditModel> studentEditModels = FXCollections.observableArrayList(
			new StudentEditModel("Hi", "Bobo", "Male", "11/22/1998", "21", "8764699382", "romaine", "34"
					, "gf", "Gcity", "32g", "332"),
			new StudentEditModel("Hello", "Boo", "Male", "july", "21", "223323", "romaine", "12",
					"4t", "rt", "nbv", "rgh")
	);

	public void handleFinishButton(javafx.event.ActionEvent e) {
		owner = finishBtn.getScene().getWindow();
		stage = (Stage) owner;
		AlertHelper.showAlert(Alert.AlertType.INFORMATION, owner, "Changes Saved", "Saved Changes!");


	}

	public void handleCancelButton(javafx.event.ActionEvent e) {
		owner = cancelBtn.getScene().getWindow();
		stage = (Stage) owner;
		stage.close();

	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		firstNameColumn.setCellFactory(forTableColumn());
		lastNameColumn.setCellFactory(forTableColumn());
		genderColumn.setCellFactory(forTableColumn());
		dobColumn.setCellFactory(forTableColumn());
		ageColumn.setCellFactory(forTableColumn());
		contactColumn.setCellFactory(forTableColumn());
		emailColumn.setCellFactory(forTableColumn());
		gradeColumn.setCellFactory(forTableColumn());
		homeRoomColumn.setCellFactory(forTableColumn());
		parentName.setCellFactory(forTableColumn());
		parentAddress.setCellFactory(forTableColumn());
		studentAddress.setCellFactory(forTableColumn());

		firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
		dobColumn.setCellValueFactory(new PropertyValueFactory<>("dob"));
		ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
		contactColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));
		emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
		gradeColumn.setCellValueFactory(new PropertyValueFactory<>("grade"));
		homeRoomColumn.setCellValueFactory(new PropertyValueFactory<>("home"));
		parentName.setCellValueFactory(new PropertyValueFactory<>("parentName"));
		parentAddress.setCellValueFactory(new PropertyValueFactory<>("parentAddress"));
		studentAddress.setCellValueFactory(new PropertyValueFactory<>("studentAddress"));

		editTable.setItems(studentEditModels);
	}
}
