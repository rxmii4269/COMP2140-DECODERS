import Database.dbConnect;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AdminController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField email;
    @FXML
    private DatePicker dob;
    @FXML
    private  TextField homeRoom;
    @FXML
    private TableView<Teacher> teacherTable;
    @FXML
    private TableColumn<Teacher,String> idcolumn;
    @FXML
    private TableColumn<Teacher,String> firstnameC;
    @FXML
    private TableColumn<Teacher,String> lastnameC;
    @FXML
    private TableColumn<Teacher,String> emailC;
    @FXML
    private TableColumn<Teacher,String> dobColumn;
    @FXML
    private TableColumn<Teacher,String> hrColumn;

    private dbConnect dc;
    private ObservableList<Teacher> data;
    private String sql = "SELECT * FROM teacher";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.dc = new dbConnect();
    }
    @FXML
    private void loadTeacherData(ActionEvent event) throws SQLException{
        try{
            Connection conn = dbConnect.getConnection();
            this.data = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                this.data.add(new Teacher(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }


        }catch (SQLException e){
            System.err.println("Error"+e);
        }

        this.idcolumn.setCellValueFactory(new PropertyValueFactory<Teacher, String>("ID"));
        this.firstnameC.setCellValueFactory(new PropertyValueFactory<Teacher, String>("firstName"));
        this.lastnameC.setCellValueFactory(new PropertyValueFactory<Teacher, String>("lastName"));
        this.emailC.setCellValueFactory(new PropertyValueFactory<Teacher, String>("email"));
        this.dobColumn.setCellValueFactory(new PropertyValueFactory<Teacher, String>("DOB"));
        this.hrColumn.setCellValueFactory(new PropertyValueFactory<Teacher, String>("homeRoom"));

        this.teacherTable.setItems(null);
        this.teacherTable.setItems(this.data);
    }

    @FXML
    private void addTeacher(ActionEvent event){
        String sqlInsert = "INSERT INTO teacher(id,fname,lname,email,DOB,homeRoom) VALUES (?,?,?,?,?,?)";

        try{
            Connection conn = dbConnect.getConnection();
            PreparedStatement state = conn.prepareStatement(sqlInsert);

            state.setString(1,this.id.getText());
            state.setString(2,this.firstname.getText());
            state.setString(3,this.lastname.getText());
            state.setString(4,this.email.getText());
            state.setString(5,this.dob.getEditor().getText());
            state.setString(6,this.homeRoom.getText());

            state.execute();
            state.close();


        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @FXML
    private  void clearFields(ActionEvent event){
        this.id.setText("");
        this.firstname.setText("");
        this.lastname.setText("");
        this.email.setText("");
        this.dob.setValue(null);
        this.homeRoom.setText("");
    }
}
