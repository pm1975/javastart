package org.example.hellofx;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainHelloFx extends Application {

    public MainHelloFx() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Start");
        stage.setTitle("Hello FX!");
        stage.show();
    }
}
