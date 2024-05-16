package ga.chopin.learning_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ListViewController {

    @FXML
    private Button btn_goHome;

    @FXML
    void goback(ActionEvent event) throws IOException {

        Stage stage = (Stage) btn_goHome.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/view/home.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}