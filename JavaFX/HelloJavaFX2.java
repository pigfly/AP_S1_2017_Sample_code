import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HelloJavaFX2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();

        grid.setMinWidth(600);
        grid.setMinHeight(400);

        grid.setVgap(5);
        grid.setHgap(20);
        grid.setGridLinesVisible(false);

        TableView table = new TableView();
        table.setMinWidth(550);
        table.setMaxHeight(300);
        GridPane.setConstraints(table, 1, 1, 3, 1);

        TableColumn column1 = new TableColumn("Priority");
        TableColumn column2 = new TableColumn("Task Description");
        TableColumn column3 = new TableColumn("Progress");

        // try catch here
        table.getColumns().addAll(column1, column2, column3);

        TextField taskName = new TextField();
        taskName.setPromptText("Enter task name");
        taskName.setMinWidth(300);
        GridPane.setConstraints(taskName, 2, 2);

        ComboBox priority = new ComboBox();
        // try catch here
        priority.getItems().addAll("Low", "High", "Medium");
        priority.setPromptText("Enter Priority");
        GridPane.setConstraints(priority, 1, 2);

        Button addButton = new Button("Add");
        addButton.setMinWidth(100);
        GridPane.setConstraints(addButton, 3, 2);

        Button cancelButton = new Button("Cancel");
        cancelButton.setMinWidth(100);
        GridPane.setConstraints(cancelButton, 3, 3);

        HBox progressArea = new HBox();
        progressArea.setAlignment(Pos.CENTER_RIGHT);
        progressArea.setSpacing(10);
        Label progressLabel = new Label("Progress");
        CheckBox completedCheckBox = new CheckBox("Completed");
        progressArea.getChildren().addAll(progressLabel, new Spinner<Integer>(0, 100, 0), completedCheckBox);

        GridPane.setConstraints(progressArea, 1, 3, 2, 1);

        grid.getChildren().addAll(table, taskName, priority, addButton, progressArea, cancelButton);

        Scene scene = new Scene(grid, 600, 400);

        stage.setScene(scene);
        stage.setTitle("www.qiaomenzhuan.com.au");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String... args) {
        Application.launch(args);
    }
}
