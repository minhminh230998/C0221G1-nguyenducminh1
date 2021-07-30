package model.Repository;

import model.bean.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String SELECT_EMPLOYEE = "select * from employee;";
    final String CREATE_EMPLOYEE = "insert into employee(name,birthday) values(?,?);";
    final String SELECT_BY_ID = "select * from employee where id=?;";
    final String DELETE_EMPLOYEE = "delete from employee where id=?;";
    final String EDIT_EMPLOYEE = "update employee set name=?,birthday=? where id=?;";
    final String SELECT_BY_NAME = "select * from employee  where name like ?;";
    public List<Employee> findAll() {
        Connection connection = baseRepository.connectDataBase();
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_EMPLOYEE);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String birthday = resultSet.getString(3);



                employeeList.add(new Employee(id, name, birthday));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
    public Employee findById(int id) {
        Employee employee = null;
        Connection connection = baseRepository.connectDataBase();

        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                int id1 = resultSet.getInt(1);

                String name = resultSet.getString(2);
                String birthday = resultSet.getString(3);

                employee = new Employee(id1, name, birthday);

            }
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
    public boolean deleteEmployee(int id) {
        boolean rowDelete = false;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_EMPLOYEE);
            statement.setInt(1, id);
            rowDelete = statement.executeUpdate() > 0;
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }
    public void createEmployee(Employee employee) {
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(CREATE_EMPLOYEE);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getBirthday());

            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean editEmployee(Employee employee) {
        boolean check = false;
        Connection connection = baseRepository.connectDataBase();
        try {

            PreparedStatement statement = connection.prepareStatement(EDIT_EMPLOYEE);
            statement.setString(1, employee.getName());

            statement.setString(2, employee.getBirthday());

            statement.setInt(3, employee.getId());
            System.out.println(statement.toString());
            check = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }
    public List<Employee> findByName(String name) {
        List<Employee> employee = new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();

        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_NAME);
            statement.setString(1, "%" + name + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name1 = resultSet.getString(2);
                String birthday = resultSet.getString(3);
                employee.add(new Employee(id, name1, birthday));

            }
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }


}
