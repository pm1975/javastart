module Controls {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    exports com.company.controls to javafx.graphics;
    exports com.company.tasks to javafx.graphics;
}