import Database.dbConnect;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import static javafx.scene.control.cell.TextFieldTableCell.forTableColumn;

public class StudentEditController implements Initializable {

	public TableView editTable;
	public TableColumn<ObservableList, String> firstNameColumn;
	public TableColumn<ObservableList, String> lastNameColumn;
	public TableColumn<ObservableList, String> genderColumn;
	public TableColumn<ObservableList, String> dobColumn;
	public TableColumn<ObservableList, String> ageColumn;
	public TableColumn<ObservableList, String> contactColumn;
	public TableColumn<ObservableList, String> emailColumn;
	public TableColumn<ObservableList, String> gradeColumn;
	public TableColumn<ObservableList, String> homeRoomColumn;
	public Button cancelBtn;
	public Button finishBtn;
	public TableColumn<ObservableList, String> parentName;
	public TableColumn<ObservableList, String> parentAddress;
	public TableColumn<ObservableList, String> studentAddress;

	//private Parent parent;
	private Window owner;
	private Stage stage;
	private ObservableList<List<StringProperty>> data = FXCollections.observableArrayList();
	private ObservableList<String> studentEditModels;

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

		try {
			buildData();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//editTable.setItems(studentEditModels);
	}

	private void buildData() throws SQLException {
		studentEditModels = FXCollections.observableArrayList();
//				StudentEditModel(getFirstName(),getLastName(),getGender(),getDOB(),getStudentAge(),getContactNum(),
//						getEmail(),getStudentGrade(),getHomeRoom(),getParentname(),getParentaddress(),getStudentaddress())
//

		try {
			Connection connection = dbConnect.getConnection();
			String sql = "SELECT * FROM student";
			PreparedStatement pr = connection.prepareStatement(sql);
			ResultSet resultSet = pr.executeQuery();
			System.out.println(resultSet.getString("name"));

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}


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
}
