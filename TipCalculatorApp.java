import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TipCalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create labels, text fields, and buttons
        Label lblBillAmount = new Label("Bill Amount:");
        TextField txtBillAmount = new TextField();
        Label lblTipPercentage = new Label("Tip Percentage:");
        Slider sliderTipPercentage = new Slider(0, 50, 15);
        sliderTipPercentage.setShowTickLabels(true);
        sliderTipPercentage.setShowTickMarks(true);
        sliderTipPercentage.setMajorTickUnit(10);
        sliderTipPercentage.setMinorTickCount(1);

        Label lblTipPercentageValue = new Label("15%");

        Label lblTipAmount = new Label("Tip Amount: $0.00");
        Label lblTotalAmount = new Label("Total Amount: $0.00");

        Button btnCalculate = new Button("Calculate");

        // Layout design
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add components to the grid
        gridPane.add(lblBillAmount, 0, 0);
        gridPane.add(txtBillAmount, 1, 0);
        gridPane.add(lblTipPercentage, 0, 1);
        gridPane.add(sliderTipPercentage, 1, 1);
        gridPane.add(lblTipPercentageValue, 2, 1);
        gridPane.add(lblTipAmount, 0, 2, 2, 1);
        gridPane.add(lblTotalAmount, 0, 3, 2, 1);
        gridPane.add(btnCalculate, 1, 4);

        // Event handling for the slider
        sliderTipPercentage.valueProperty().addListener((observable, oldValue, newValue) -> {
            lblTipPercentageValue.setText(String.format("%.0f%%", newValue.doubleValue()));
        });

        // Event handling for the Calculate button
        btnCalculate.setOnAction(event -> {
            try {
                // Get the bill amount and tip percentage
                double billAmount = Double.parseDouble(txtBillAmount.getText());
                double tipPercentage = sliderTipPercentage.getValue();

                // Calculate the tip and total amounts
                double tipAmount = billAmount * (tipPercentage / 100);
                double totalAmount = billAmount + tipAmount;

                // Update the labels
                lblTipAmount.setText(String.format("Tip Amount: $%.2f", tipAmount));
                lblTotalAmount.setText(String.format("Total Amount: $%.2f", totalAmount));
            } catch (NumberFormatException e) {
                // Handle invalid input
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Input Error");
                alert.setHeaderText("Invalid Input");
                alert.setContentText("Please enter a valid number for the bill amount.");
                alert.showAndWait();
            }
        });

        // Set up the scene and stage
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Tip Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
