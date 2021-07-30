package model.repository;


import model.bean.User;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    BaseRepository baseRepository = new BaseRepository();
    Connection connection = baseRepository.connectDataBase();
    final String SELECT_ALL_USER = "select * from user;";
    final String FIND_BY_ID = "select * from user\n" +
            "where id=?;";
    final String UPDATE_FIND_ID = "update  user\n" +
            "set name=?,\n" +
            "email=?,\n" +
            "country=?\n" +
            "where id=?;";
    final String CREATE_USER = "insert into user(id,name,email,country)\n" +
            "values(?,?,?,?);";
    final String SEARCH_USER = "select * from user\n" +
            "where country like ?;";
    final String SORT = "select * from user\n" +
            "order by name;";
    public static final String DELETE_USERS_SQL = "delete from user where id = ?;";


    public List<User> findAll() {


        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                String country = resultSet.getString(4);
                userList.add(new User(id, name, email, country));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public User findById(int id) {


        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            statement = connection.prepareStatement(FIND_BY_ID);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");

                user = new User(id, name, email, country);
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    public boolean update(User user) {
        boolean updateUser = false;

        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_FIND_ID)) {

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.setInt(4, user.getId());
            updateUser = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return updateUser;
    }

    public boolean deleteUser(int id) {
        boolean rowDeleted = false;

        PreparedStatement statement = null;
        try {

            statement = connection.prepareStatement(DELETE_USERS_SQL);
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    public void createUser(User user) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(CREATE_USER);
            statement.setInt(1, user.getId());
            statement.setString(2, user.getName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getCountry());
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> search(String country) {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_USER);
            preparedStatement.setString(1, "%"+country +"%");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country1 = resultSet.getString("country");
                userList.add(new User(id, name, email, country1));


            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }

    public List<User> sort() {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SORT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name1 = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                userList.add(new User(id, name1, email, country));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
