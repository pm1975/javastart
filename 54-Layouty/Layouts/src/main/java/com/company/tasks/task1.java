package com.company.tasks;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class task1 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("/tasks/task1.fxml"));
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("helloView");
        stage.show();
    }
}
