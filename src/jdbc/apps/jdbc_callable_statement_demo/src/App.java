import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        final String url = "jdbc:mysql://localhost:3307/classicmodels";
        final String username = "root";
        final String password = "password";

        /* Establishing a connection with the DB */
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            /* Fetching some DB metadata */
            System.out.println("Connected to database server "
                    + connection.getMetaData().getDatabaseProductName()
                    + " version: "
                    + connection.getMetaData().getDatabaseProductVersion());

            /* CallableStatement Demo */
            String procedureCallFormat = "{ call getTotalOrders() }";
            try (CallableStatement callableStatement = connection.prepareCall(procedureCallFormat)) {
                ResultSet rs = callableStatement.executeQuery();
                System.out.print("Total number of orders in `orders` table = ");
                while (rs.next()) {
                    System.out.println(rs.getInt("totalOrders"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
