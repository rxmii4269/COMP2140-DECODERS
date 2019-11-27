
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

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

    public void initialize (URL url, ResourceBundle rb){
        if(this.loginModel.isDBconnected()){
            this.dbstatus.setText("Connected To DataBase");
        }else{
            this.dbstatus.setText("Not Connected To DAtaBAse");
        }
        this.combobox.setItems(FXCollections.observableArrayList(option.values()));
    }
}