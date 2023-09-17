package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private Connection connection;
    String url = "jdbc:mysql://localhost/testdb?serverTimezone=Europe/Moscow&useSSL=false&allowPublicKeyRetrieval=true";
    String username = "StArtois";
    String password = "admin";

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
