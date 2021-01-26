package main.java.com.zs.hobbytracker.dao;

import main.java.com.zs.hobbytracker.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    PreparedStatement statement;

    public int addUser(Connection connection, User user) {
        String query = "insert into users(user_id,name) values(?,?)";
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, user.getId());
            statement.setString(2, user.getName());
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

}