package com.company.layouts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BorderPaneFx extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("/borderPaneView.fxml"));
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("BorderPane");
        stage.show();
    }
}
