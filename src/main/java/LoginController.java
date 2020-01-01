
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public Label formlabel;
    LoginModel loginModel = new LoginModel();

    @FXML
    private Label dbstatus;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private ComboBox<option> combobox;

    @FXML
    private Button loginButton;

    @FXML
    private Label loginStatus;

    public void initialize (URL url, ResourceBundle rb){
        if(this.loginModel.isDBconnected()){
            this.dbstatus.setText("Connected To DataBase");
        }else{
            this.dbstatus.setText("Not Connected To DataBase");
        }
        this.combobox.setItems(FXCollections.observableArrayList(option.values()));
    }
    @FXML
    public void Login(ActionEvent event){
        try {
            if(this.loginModel.isLogin(this.username.getText(), this.password.getText(), this.combobox.getValue().toString())){
                Stage stage = (Stage)this.loginButton.getScene().getWindow();
                stage.close();
                switch (this.combobox.getValue().toString()){
                    case "Admin":
                        adminLogin();
                        break;
                    case "Teacher":
                        teacherLogin();
                        break;
                    default:
                        this.loginStatus.setText("Select Admin / Teacher");
                }
            }
            else{
                    this.loginStatus.setText("Username or PassWord Incorrect!");
            }

        }catch (Exception ignored){

        }
    }

    public void teacherLogin(){
        try{
            Stage userStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = loader.load(getClass().getResource("/fxml/teacher.fxml").openStream());
            TeacherController tcontroller = loader.getController();

            Scene scene = new Scene(root);
            userStage.setScene(scene);
            userStage.setTitle("Teacher Dashboard");
            userStage.setResizable(false);
            userStage.show();

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public void adminLogin(){
        try{
            Stage adminStage = new Stage();
            FXMLLoader adminloader = new FXMLLoader();
            Pane adminroot = adminloader.load(getClass().getResource("/fxml/Admin.fxml").openStream());
            AdminController adminController = adminloader.getController();

            Scene scene = new Scene(adminroot);
            adminStage.setScene(scene);
            adminStage.setTitle("Admin Dashboard");
            adminStage.setResizable(false);
            adminStage.show();

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}