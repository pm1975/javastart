package org.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainHelloFx extends Application {

    public MainHelloFx() {
        System.out.println("Constructor");
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/helloView.fxml"));
        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        System.out.println("Start");
        stage.setTitle("Hello FX!");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("Init");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stop");
    }
}
