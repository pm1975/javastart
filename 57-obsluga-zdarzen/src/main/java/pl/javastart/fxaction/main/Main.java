package pl.javastart.fxaction.main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setTitle("Events example");
        stage.show();

        scene.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Najechano kursoerm na scenę");
            }
        });
        scene.setOnMouseExited(mouseEvent -> System.out.println("Kursor opuścił scenę"));

        scene.addEventFilter(MouseEvent.ANY, x -> System.out.println("Dowolne zdarzenie myszy"));
        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, x-> System.out.println("Wciśnięto i puszczono przycisk myszy"));
        scene.addEventFilter(MouseEvent.MOUSE_DRAGGED, x-> System.out.println("Przesunięto mysz z wciśniętym przyciskiem"));
        scene.addEventFilter(MouseEvent.MOUSE_ENTERED, x-> System.out.println("Mysz w obszarze kontrolki - witaj myszko!"));
        scene.addEventFilter(MouseEvent.MOUSE_EXITED, x-> System.out.println("Mysz opuściła obszar kontrolki - żegnaj myszko!"));
        scene.addEventFilter(MouseEvent.MOUSE_MOVED, x-> System.out.println("Przesunięcie myszy bez wciśniętych przycisków"));
        scene.addEventFilter(MouseEvent.MOUSE_PRESSED, x-> System.out.println("Wciśnięto przycisk myszy"));
        scene.addEventFilter(MouseEvent.MOUSE_RELEASED, x-> System.out.println("Zwolniono przycisk myszy"));

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println("Wciśnięto klawisz");
            }
        });
        scene.setOnKeyTyped(keyEvent -> System.out.println("Wciśnięto i puszczono przycisk (setOnKeyTyped)"));

        scene.addEventFilter(KeyEvent.ANY, x-> System.out.println("Dowolne zdarzenie klawiatury"));
        scene.addEventFilter(KeyEvent.KEY_PRESSED, x-> System.out.println("Wciśnięto przycisk"));
        scene.addEventFilter(KeyEvent.KEY_RELEASED, x-> System.out.println("Zwolniono przycisk"));
        scene.addEventFilter(KeyEvent.KEY_TYPED, x-> System.out.println("Wciśnięto i puszczono przycisk"));
    }
}
