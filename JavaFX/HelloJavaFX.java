import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.Group;

public class HelloJavaFX extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello JavaFx");

        Group root = new Group(new Label("Hello world"));
        Scene scene = new Scene(root, 325.0, 467.0);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
