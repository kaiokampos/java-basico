package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement(
                    "DELETE FROM department "
                            + "WHERE "
                            + "Id = ?");

            preparedStatement.setInt(1, 5);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }

    }
}
