package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        final Controller controller = new Controller();

        final GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.add(controller.input(), 0, 0);
        root.add(controller.add(), 1, 0);
        root.add(controller.result(), 0, 1);

        primaryStage.setTitle("Time calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
