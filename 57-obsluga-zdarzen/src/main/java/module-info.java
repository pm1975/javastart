module fxaction {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.javastart.fxaction.main;
    opens pl.javastart.fxaction.controller to javafx.fxml;
}