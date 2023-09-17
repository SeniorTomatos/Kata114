package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService service = new UserServiceImpl();
        service.createUsersTable();
        service.createUsersTable();
        service.saveUser("Denis", "Strukov", (byte) 30);
        service.saveUser("Pavel", "Seregin", (byte) 29);
        service.removeUserById(1);
        service.getAllUsers();
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}
