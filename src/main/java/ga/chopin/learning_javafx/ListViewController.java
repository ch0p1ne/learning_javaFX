package ga.chopin.learning_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ListViewController {

    public ControllerFeatures controllerFeatures = new ControllerFeatures();
    @FXML
    private Button btn_goHome;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        controllerFeatures.switchScene(event, "/view/home.fxml");

    }

}
