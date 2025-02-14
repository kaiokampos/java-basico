package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    private static Connection connection = null;

    public static Connection getConnection(){
        if (connection == null){
            try {
                Properties properties = loadProperties();
                String url = properties.getProperty("url");
                connection = DriverManager.getConnection(url, properties);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection(){
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties(){
        try (FileInputStream fileInputStream = new FileInputStream("application.properties")){

            Properties properties = new Properties();
            properties.load(fileInputStream);
            return properties;

        } catch (FileNotFoundException e) {
            throw new DbException(e.getMessage());
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
}
