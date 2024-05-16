module ga.chopin.learning_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ga.chopin.learning_javafx to javafx.fxml;
    exports ga.chopin.learning_javafx;
}