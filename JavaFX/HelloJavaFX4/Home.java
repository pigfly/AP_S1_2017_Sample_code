package HelloJavaFX4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Home extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GridPane grid = FXMLLoader.load(getClass().getResource("ui.fxml"));
		Scene scene = new Scene(grid, 600, 400);
		
		stage.setScene(scene);
		stage.setTitle("www.qiaomenzhuan.com.au");
		stage.setAlwaysOnTop(false);
		stage.setResizable(false);
		
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
