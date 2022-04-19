import java.sql.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        final String url = "jdbc:mysql://localhost:3307/jdbc_demo";
        final String username = "root";
        final String password = "password";

        /* Establishing a connection with the DB */
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            /* Fetching some DB metadata */
            System.out.println("Connected to database server "
                    + connection.getMetaData().getDatabaseProductName()
                    + " version: "
                    + connection.getMetaData().getDatabaseProductVersion());

            /* Statement Demo */
            try (Statement statement = connection.createStatement()) {
                // Read (Retrieve) Operation using Statement
                String sql = "SELECT * FROM Worker WHERE WORKER_ID = 3";
                ResultSet result = statement.executeQuery(sql);
                while (result.next()) {
                    int id = result.getInt("WORKER_ID");
                    String firstName = result.getString(1);
                    System.out.println(id + "\t" + firstName);
                }

                // Create Operation using Statement
                String insertSql = """
                        INSERT INTO Worker (
                            WORKER_ID,
                            FIRST_NAME,
                            LAST_NAME,
                            SALARY,
                            JOINING_DATE,
                            DEPARTMENT)
                        VALUES (
                            10, 'Tony', 'Stark', '50000000', NOW(), 'R&D'
                            )""";
                int rowsInserted = statement.executeUpdate(insertSql);
                System.out.println(rowsInserted + " rows inserted.");

                // Update Operation using Statement
                String updateSql1 = """
                        UPDATE Worker
                        SET
                            FIRST_NAME = 'Iron'
                        WHERE
                            WORKER_ID = 10""";
                int rowsUpdated = statement.executeUpdate(updateSql1);
                System.out.println(rowsUpdated + "  rows updated.");

                // Batch Update using Statement
                String updateSql2 = """
                        UPDATE Worker
                        SET
                            LAST_NAME = 'Man'
                        WHERE
                            WORKER_ID = 10""";
                statement.addBatch(updateSql1);
                statement.addBatch(updateSql2);
                int[] recordsAffected = statement.executeBatch();
                System.out.println("Status of batch updates:: " + Arrays.toString(recordsAffected));

                // Delete Operation using Statement
                String deleteSql = """
                        DELETE FROM Worker
                        WHERE
                            WORKER_ID = 10""";
                int rowsDeleted = statement.executeUpdate(deleteSql);
                System.out.println(rowsDeleted + "  rows deleted.");
            }

            /* PreparedStatement Demo */
            // Read (Retrieve) Operation using PreparedStatement
            String selectFormat = """
                    SELECT *
                    FROM
                        Worker
                    WHERE
                        WORKER_ID > ?
                    AND
                        DEPARTMENT = ?""";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectFormat)) {
                preparedStatement.setInt(1, 3);
                preparedStatement.setString(2, "Admin");
                ResultSet rs = preparedStatement.executeQuery();
                if (!rs.isBeforeFirst()) {
                    System.out.println("no rows found");
                } else {
                    int columnCount = rs.getMetaData().getColumnCount();
                    System.out.println("Columns and Types::");
                    for (int i = 0; i < columnCount; i++) {
                        System.out.print(rs.getMetaData().getColumnName(i + 1) + ":"
                                + rs.getMetaData().getColumnTypeName(i + 1) + "\t");
                    }
                    System.out.println("\nRecords::");
                    while (rs.next()) {
                        for (int i = 1; i < columnCount + 1; i++) {
                            System.out.print(rs.getObject(i) + "\t");
                        }
                        System.out.println();
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
