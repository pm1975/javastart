module fxmvc {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.javastart.mvc to javafx.graphics;
    opens pl.javastart.mvc to javafx.fxml;
    exports tasks.main to javafx.graphics;
    opens tasks.main to javafx.fxml;
    exports tasks.controller to javafx.graphics;
    opens tasks.controller to javafx.fxml;

}