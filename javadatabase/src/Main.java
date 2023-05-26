/*import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "scott";
        String password = "tiger";


        String query = "SELECT e.ename, d.dname, e.job, e.sal "
                + "FROM emp e JOIN dept d ON e.deptno = d.deptno "
                + "WHERE e.sal >= 1500";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute the query
            resultSet = statement.executeQuery(query);

            // Print the results
            while (resultSet.next()) {
                String name = resultSet.getString("ename");
                String deptName = resultSet.getString("dname");
                String job = resultSet.getString("job");
                int salary = resultSet.getInt("sal");

                System.out.println("Name: " + name);
                System.out.println("Department: " + deptName);
                System.out.println("Job: " + job);
                System.out.println("Salary: " + salary);
                System.out.println("--------------------");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load Oracle JDBC driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Failed to connect to the Oracle database: " + e.getMessage());
        } finally {
            // Close the resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Failed to close the resources: " + e.getMessage());
            }
        }
    }
}*/
/*
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // Connection variables
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "scott";
        String password = "tiger";

        // New row values
        int deptno = 60;
        String dname = "DEVELOP";
        String loc = "SEOUL";

        // SQL query
        String query = "INSERT INTO dept (deptno, dname, loc) VALUES (?, ?, ?)";

        // Connection and prepared statement objects
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a prepared statement with parameter placeholders
            statement = connection.prepareStatement(query);

            // Set the parameter values
            statement.setInt(1, deptno);
            statement.setString(2, dname);
            statement.setString(3, loc);

            // Execute the query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("New row inserted successfully!");
            } else {
                System.out.println("Failed to insert a new row.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load Oracle JDBC driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Failed to connect to the Oracle database: " + e.getMessage());
        } finally {
            // Close the resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Failed to close the resources: " + e.getMessage());
            }
        }
    }
}
*/

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // Connection variables
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "scott";
        String password = "tiger";

        // SQL query
        String query = "SELECT * FROM dept";

        // Connection and statement objects
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute the query
            resultSet = statement.executeQuery(query);

            // Print the results
            while (resultSet.next()) {
                int deptno = resultSet.getInt("deptno");
                String dname = resultSet.getString("dname");
                String loc = resultSet.getString("loc");

                System.out.println("Department Number: " + deptno);
                System.out.println("Department Name: " + dname);
                System.out.println("Location: " + loc);
                System.out.println("--------------------");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load Oracle JDBC driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Failed to connect to the Oracle database: " + e.getMessage());
        } finally {
            // Close the resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Failed to close the resources: " + e.getMessage());
            }
        }
    }
}
