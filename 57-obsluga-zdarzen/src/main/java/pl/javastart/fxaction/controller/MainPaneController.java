package pl.javastart.fxaction.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.util.Locale;

public class MainPaneController {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

    public void initialize() {
        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> {
            System.out.println("Wciśnięto " + keyEvent.getCharacter());
        });
    }

    public void toLowerCaseAction(ActionEvent event) {
        System.out.println("Wciśnięto przycisk");
        System.out.println(event.getEventType());
        String originalText = mainTextArea.getText();
        String lowerText = originalText.toLowerCase();
        mainTextArea.setText(lowerText);
    }
}
