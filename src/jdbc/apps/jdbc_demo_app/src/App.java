import java.sql.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver"); // optional

        final String url = "jdbc:mysql://localhost:3307/jdbc_demo";
        final String username = "root";
        final String password = "password";

        System.out.println("Establishing a connection to the database...\n");
        try (Connection connection = DriverManager.getConnection(url, username, password);) {
            /* Fetching some DB metadata */
            System.out.println("Connected to database server "
                    + connection.getMetaData().getDatabaseProductName()
                    + " version: "
                    + connection.getMetaData().getDatabaseProductVersion()
                    + "\n");

            System.out.println("USING STATEMENT:: ");
            try (Statement statement = connection.createStatement()) {
                System.out.println("Create operation:");
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
                            )
                        """;
                int rowsInserted = statement.executeUpdate(insertSql);
                System.out.println(rowsInserted + " rows inserted.");
                System.out.println();

                System.out.println("Read//Retrieve operation:");
                String selectAllSql = """
                        SELECT
                            *
                        FROM
                            Worker
                        """;
                ResultSet result = statement.executeQuery(selectAllSql);
                System.out.println("WORKER_ID\tFIRST_NAME\tLAST_NAME\tSALARY\tJOINING_DATE\tDEPARTMENT");
                while (result.next()) {
                    int workerId = result.getInt("WORKER_ID");
                    String firstName = result.getString("FIRST_NAME");
                    String lastName = result.getString("LAST_NAME");
                    int salary = result.getInt(4);
                    Timestamp joiningDate = result.getTimestamp("JOINING_DATE");
                    String department = result.getString(6);
                    System.out.println(
                            String.format(
                                    "%d\t%s\t%s\t%d\t%s\t%s",
                                    workerId,
                                    firstName,
                                    lastName,
                                    salary,
                                    joiningDate,
                                    department));
                }
                System.out.println();

                System.out.println("Update operation:");
                String updateSql1 = """
                        UPDATE Worker
                        SET
                            FIRST_NAME = 'Iron'
                        WHERE
                            FIRST_NAME = 'Tony'""";
                int rowsUpdated = statement.executeUpdate(updateSql1);
                System.out.println(rowsUpdated + "  rows updated.");
                System.out.println();

                System.out.println("Batch Update operation:");
                String updateSql2 = """
                        UPDATE Worker
                        SET
                            LAST_NAME = 'Man'
                        WHERE
                            LAST_NAME = 'Stark'""";
                statement.addBatch(updateSql1);
                statement.addBatch(updateSql2);
                int[] recordsAffected = statement.executeBatch();
                System.out.println("Status of batch updates:: " + Arrays.toString(recordsAffected));
                System.out.println();

                // Delete Operation using Statement
                String deleteSql = """
                        DELETE FROM Worker
                        WHERE
                            WORKER_ID = 10""";
                int rowsDeleted = statement.executeUpdate(deleteSql);
                System.out.println(rowsDeleted + "  rows deleted.");
                System.out.println();
            }

            System.out.println("USING PREPARED STATEMENT:: ");
            System.out.println("Read//Retrieve operation:");
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
