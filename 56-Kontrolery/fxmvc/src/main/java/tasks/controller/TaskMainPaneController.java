package tasks.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TaskMainPaneController {

    @FXML
    private Label label1;

    @FXML
    private Button button1;

    @FXML
    private Label label2;

    @FXML
    private Button button2;

    public void initialize() {
        label1.setText("Etykieta 1");
        button1.setText("Przycisk 1");
        label2.setText("Etykieta 2");
        button2.setText("Przycisk 2");
    }
}
