package Chapter_4;

import java.sql.Connection;

import java.sql.Statement;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.ResultSetMetaData;

import java.sql.SQLException;

public class DisplayAuthors {

    static final String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";

    static final String DATABASE_URL = "jdbc:odbc:Books";

    public static void main(String args[]) {

        Connection connection = null;

        Statement statement = null;

        ResultSet resultSet = null;

        try {

            Class.forName(DRIVER);

            connection = DriverManager.getConnection(DATABASE_URL, "jhtp7", "jhtp7");

            statement = connection.createStatement();

            resultSet = statement.executeQuery(
                    "SELECT authorID, firstName, lastName FROM authors");

            ResultSetMetaData metaData = resultSet.getMetaData();

            int numberOfColumns = metaData.getColumnCount();

            System.out.println("Authors Table of Books Database:\n");
            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }

            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                }
                System.out.println();

            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException classNotFound) {
            classNotFound.printStackTrace();
        } finally {

            try {

                resultSet.close();

                statement.close();

                connection.close();

            } catch (Exception exception) {

                exception.printStackTrace();

            }
        }

    }

}
