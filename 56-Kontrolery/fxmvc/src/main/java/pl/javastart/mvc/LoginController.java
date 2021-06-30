package pl.javastart.mvc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Label usernameLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Button loginButton;

    public void initialize() {
        String labelText = usernameLabel.getText();
        System.out.println(labelText);
        usernameTextField.setText("Tekst z kontrolera");
    }
}
