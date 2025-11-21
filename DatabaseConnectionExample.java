import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionExample {
    public static void main(String[] args) {
        // Database URL, Username, and Password
        String url = "jdbc:mysql://localhost:3306/testdb";  // Update the database name
        String user = "root";
        String password = "";

        // Step 1: Establish the database connection
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database successfully!");

            // Step 2: Create a Statement object to send SQL queries
            Statement statement = connection.createStatement();

            // Step 3: Execute a query and process the results
            String query = "SELECT * FROM employees";  // Adjust table name and columns as needed
            ResultSet resultSet = statement.executeQuery(query);

            // Display the results
            System.out.println("Employee Details:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");

                System.out.printf("ID: %d, Name: %s, Salary: %.2f%n", id, name, salary);
            }

        } catch (SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}
