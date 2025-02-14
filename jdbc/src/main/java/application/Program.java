package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId)" +
                    "VALUES (?,?,?,?,?)");

            preparedStatement.setString(1,"Kaio");
            preparedStatement.setString(2,"Kaio@kaio.com.br");
            preparedStatement.setDate(3,new java.sql.Date(simpleDateFormat.parse("22/10/2013").getTime()));
            preparedStatement.setDouble(4, 5000.0);
            preparedStatement.setInt(5, 4);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done! Rows affected "+ rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }



    }
}
