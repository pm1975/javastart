package com.company.layouts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HBoxVBoxFx extends Application {
    public static void main(String[] args) {
        System.out.println("Main");
        launch(args);
    }

    public HBoxVBoxFx() {
        System.out.println("Constructor");
    }

    @Override
    public void init() throws Exception {
        System.out.println("Init");
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("/hBoxVBoxView.fxml"));
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("HBox i VBox");
        stage.show();
        System.out.println("Start");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stop");
    }
}
