import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {
    private TextField display = new TextField();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        display.setEditable(false);
        grid.add(display, 0, 0, 4, 1);

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        int row = 1, col = 0;
        for (String buttonText : buttons) {
            Button button = new Button(buttonText);
            button.setOnAction(e -> onButtonClick(buttonText));
            grid.add(button, col, row);

            col++;
            if (col == 4) {
                col = 0;
                row++;
            }
        }

        Scene scene = new Scene(grid, 200, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

    private void onButtonClick(String text) {
        if (text.equals("=")) {
            try {
                display.setText(eval(display.getText()));
            } catch (Exception e) {
                display.setText("Error");
            }
        } else if (text.equals("C")) {
            display.clear();
        } else {
            display.appendText(text);
        }
    }

    private String eval(String expression) {
        // Basic eval method for simple expressions
        return String.valueOf((int) new ScriptEngineManager().getEngineByName("JavaScript").eval(expression));
    }
}
