module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports com.company.mp3player.main to javafx.graphics;
    opens com.company.mp3player.controller to javafx.fxml;
}