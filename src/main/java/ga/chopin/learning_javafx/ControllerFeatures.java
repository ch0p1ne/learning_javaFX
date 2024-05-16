package ga.chopin.learning_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ControllerFeatures {

    public void switchScene(ActionEvent event, String urlView) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(urlView))); // Objects.re... fait par InteliJ
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
