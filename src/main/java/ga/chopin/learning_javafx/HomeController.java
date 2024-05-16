package ga.chopin.learning_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    // class qui fournie des fonctionnalier commune au different controller de vue
    // tels que le changement de scene
    private final ControllerFeatures controllerFeatures = new ControllerFeatures();

    @FXML
    private Button btn_switchScene_listview;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void btn_switchScene_listview_onAction(ActionEvent actionEvent) throws IOException {
        controllerFeatures.switchScene(actionEvent, "/view/listview.fxml");
    }
}
