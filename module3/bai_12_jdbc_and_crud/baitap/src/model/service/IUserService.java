package model.service;

import model.bean.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(int id);

    boolean update(User user);

    boolean deleteUser(int id);

    void createUser(User user);

    List<User> search(String country);

    List<User> sort();

}
