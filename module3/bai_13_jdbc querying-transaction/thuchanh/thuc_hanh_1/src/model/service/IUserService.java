package model.service;

import model.bean.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface IUserService {
    public List<User> findAll();
    public User findById(int id);
    public User getById(int id);
    public void createUser(User user);
    public boolean deleteUser(int id);
    public boolean updateUser(User user);

}
