package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static Connection connection;
    static String url = "jdbc:mysql://localhost/testdb?serverTimezone=Europe/Moscow&useSSL=false&allowPublicKeyRetrieval=true";
    static String username = "StArtois";
    static String password = "admin";

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
