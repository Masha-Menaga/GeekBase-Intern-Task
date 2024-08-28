import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUD {

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/company";
    private static final String USER = "root";
    private static final String PASSWORD = "//Your_Password";

    public static void main(String[] args) {
        try {
            // 1. Establish connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database.");

            // 2. Create table (if not exists)
            createEmployeeTable(connection);

            // 3. Perform CRUD operations
            // a. Insert a new employee
            insertEmployee(connection, "John Doe", 30, "Engineering", 60000.00);

            // b. Read and display all employees
            readEmployees(connection);

            // c. Update an employee's salary
            updateEmployeeSalary(connection, 1, 65000.00);

            // d. Delete an employee
            deleteEmployee(connection, 1);

            // e. Read and display all employees after update and delete
            readEmployees(connection);

            // 4. Close the connection
            connection.close();
            System.out.println("Connection closed.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to create the employee table
    private static void createEmployeeTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS employee (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(100) NOT NULL, " +
                "age INT NOT NULL, " +
                "department VARCHAR(100), " +
                "salary DECIMAL(10, 2)" +
                ")";

        Statement statement = connection.createStatement();
        statement.execute(createTableSQL);
        System.out.println("Employee table created (if not exists).");
    }

    // Method to insert a new employee
    private static void insertEmployee(Connection connection, String name, int age, String department, double salary) throws SQLException {
        String insertSQL = "INSERT INTO employee (name, age, department, salary) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.setString(3, department);
        preparedStatement.setDouble(4, salary);
        int rowsAffected = preparedStatement.executeUpdate();
        System.out.println(rowsAffected + " employee(s) inserted.");
    }

    // Method to read all employees
    private static void readEmployees(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectSQL);

        System.out.println("Employee List:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String department = resultSet.getString("department");
            double salary = resultSet.getDouble("salary");

            System.out.printf("ID: %d, Name: %s, Age: %d, Department: %s, Salary: %.2f%n", id, name, age, department, salary);
        }
    }

    // Method to update an employee's salary
    private static void updateEmployeeSalary(Connection connection, int id, double newSalary) throws SQLException {
        String updateSQL = "UPDATE employee SET salary = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
        preparedStatement.setDouble(1, newSalary);
        preparedStatement.setInt(2, id);
        int rowsAffected = preparedStatement.executeUpdate();
        System.out.println(rowsAffected + " employee(s) updated.");
    }

    // Method to delete an employee by ID
    private static void deleteEmployee(Connection connection, int id) throws SQLException {
        String deleteSQL = "DELETE FROM employee WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
        preparedStatement.setInt(1, id);
        int rowsAffected = preparedStatement.executeUpdate();
        System.out.println(rowsAffected + " employee(s) deleted.");
    }
}
