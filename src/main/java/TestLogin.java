import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestLogin extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage logstage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Admin.fxml"));
        logstage.setTitle("School Management System");
        logstage.setScene(new Scene(root, 800, 600));
        logstage.show();
    }
}
