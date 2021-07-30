package model.repository;

import model.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    BaseRepository baseRepository = new BaseRepository();
    final String SELECT_ALL_USER = "select * from user;";
    final String INSERT_USER = "call insert_user(?,?,?,?);";
    final String DELETE_USER = "delete from user where id = ?;";
    final String SELECT_USER_ID = "select * from user" +
            "           where id=?;";
    final String UPDATE_USER = "update user set name = ?,email= ?, country =? where id = ?;";
final String GET_BY_ID="call get_user_by_id(?);";

    public List<User> findAll() {
        Connection connection = baseRepository.connectDataBase();
        List<User> list = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_USER);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                list.add(new User(id, name, email, country));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public User findById(int id) {
        Connection connection = baseRepository.connectDataBase();
        User user = null;
        ResultSet resultSet = null;
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(SELECT_USER_ID);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id1, name, email, country);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    public User getById(int id) {
        Connection connection = baseRepository.connectDataBase();
        User user = null;
        ResultSet resultSet = null;
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(GET_BY_ID);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id1, name, email, country);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public boolean deleteUser(int id) {
        boolean rowDelete = false;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_USER);
            statement.setInt(1, id);
            rowDelete = statement.executeUpdate() > 0;
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    public void createUser(User user) {
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_USER);
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
    public boolean updateUser(User user){
        boolean rowUpdate=false;
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(UPDATE_USER);
            statement.setString(1,user.getName());
            statement.setString(2,user.getEmail());
            statement.setString(3,user.getCountry());
            statement.setInt(4,user.getId());
            rowUpdate=statement.executeUpdate()>0;
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

}
