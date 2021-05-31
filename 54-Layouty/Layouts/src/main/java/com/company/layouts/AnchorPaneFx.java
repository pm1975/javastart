package com.company.layouts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AnchorPaneFx extends Application {
    public static void main(String[] args) {
        System.out.println("main");
        launch(args);
    }

    public AnchorPaneFx() {
        System.out.println("Constructor");
    }

    @Override
    public void init() throws Exception {
        System.out.println("Init");
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Start");
        Pane pane = FXMLLoader.load(getClass().getResource("/anchorPaneView.fxml"));
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("AnchorPane");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stop");
    }
}
