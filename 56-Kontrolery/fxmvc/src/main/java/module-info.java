module fxmvc {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.javastart.mvc to javafx.graphics;
    opens pl.javastart.mvc to javafx.fxml;
}