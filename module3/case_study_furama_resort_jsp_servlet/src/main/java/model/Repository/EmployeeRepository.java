package model.Repository;

import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Employee;
import model.bean.employee.Position;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    BaseRepository baseRepository = new BaseRepository();
    PositionRepository positionRepository = new PositionRepository();
    EducationDegreeRepository educationDegreeRepository=new EducationDegreeRepository();
    DivisionRepository divisionRepository=new DivisionRepository();
    final String SELECT_EMPLOYEE = "select * from nhan_vien;";
    final String CREATE_EMPLOYEE = "insert into nhan_vien(id_nhan_vien,ten_nhan_vien,id_vi_tri_lam_viec,id_trinh_do_nhan_vien,id_bo_phan_nhan_vien,ngay_sinh,so_CMND,gioi_tinh,luong,so_DT,email,dia_chi) values(?,?,?,?,?,?,?,?,?,?,?,?);";
    final String SELECT_BY_ID = "select * from nhan_vien where id_nhan_vien=?;";
    final String DELETE_EMPLOYEE = "delete from nhan_vien where id_nhan_vien=?;";
    final String EDIT_EMPLOYEE = "update nhan_vien set ten_nhan_vien=?,id_vi_tri_lam_viec=?,id_trinh_do_nhan_vien=?,id_bo_phan_nhan_vien=?,ngay_sinh=?,so_CMND=?,gioi_tinh=?,luong=?,so_DT=?,email=?,dia_chi=? where id_nhan_vien=?;";
    final String SELECT_BY_NAME = "select * from nhan_vien where ten_nhan_vien like ?;";


    public List<Employee> findAll() {
        Connection connection = baseRepository.connectDataBase();
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_EMPLOYEE);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                String id = resultSet.getString("id_nhan_vien");
                int idViTri = resultSet.getInt("id_vi_tri_lam_viec");
                int idBoPhan = resultSet.getInt("id_bo_phan_nhan_vien");
                int idTrinhDo = resultSet.getInt("id_trinh_do_nhan_vien");
                String name = resultSet.getString("ten_nhan_vien");
                String birthday = resultSet.getString("ngay_sinh");
                String idCard = resultSet.getString("so_CMND");
                String gender = resultSet.getString("gioi_tinh");
                Double salary = resultSet.getDouble("luong");
                String phone = resultSet.getString("so_DT");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                Position position = positionRepository.findPositionById(idViTri);
                EducationDegree educationDegree=educationDegreeRepository.findEducationDegreeById(idTrinhDo);
                Division division=divisionRepository.findPositionById(idBoPhan);
                employeeList.add(new Employee(id, position, educationDegree, division, name, birthday, idCard, gender, salary, phone, email, address));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public Employee findById(String id) {
        Employee employee = null;
        Connection connection = baseRepository.connectDataBase();

        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                String id1 = resultSet.getString("id_nhan_vien");
                int idViTri = resultSet.getInt("id_vi_tri_lam_viec");
                int idBoPhan = resultSet.getInt("id_bo_phan_nhan_vien");
                int idTrinhDo = resultSet.getInt("id_trinh_do_nhan_vien");
                String name = resultSet.getString("ten_nhan_vien");
                String birthday = resultSet.getString("ngay_sinh");
                String idCard = resultSet.getString("so_CMND");
                String gender = resultSet.getString("gioi_tinh");
                Double salary = resultSet.getDouble("luong");
                String phone = resultSet.getString("so_DT");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                Position position = positionRepository.findPositionById(idViTri);
                EducationDegree educationDegree=educationDegreeRepository.findEducationDegreeById(idTrinhDo);
                Division division=divisionRepository.findPositionById(idBoPhan);
                employee = new Employee(id1, position, educationDegree, division, name, birthday, idCard, gender, salary, phone, email, address);

            }
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public boolean deleteEmployee(String id) {
        boolean rowDelete = false;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_EMPLOYEE);
            statement.setString(1, id);
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
            statement.setString(1, employee.getId());
            statement.setString(2, employee.getName());
            statement.setInt(3, employee.getIdPosition().getId());
            statement.setInt(4, employee.getEducationDegree().getId());
            statement.setInt(5, employee.getDivision().getId());
            statement.setString(6, employee.getDateOfBirth());
            statement.setString(7, employee.getIdCard());
            statement.setString(8, employee.getGender());
            statement.setDouble(9, employee.getSalary());
            statement.setString(10, employee.getPhone());
            statement.setString(11, employee.getEmail());
            statement.setString(12, employee.getAddress());
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
            statement.setInt(2, employee.getIdPosition().getId());
            statement.setInt(3, employee.getEducationDegree().getId());
            statement.setInt(4, employee.getDivision().getId());
            statement.setString(5, employee.getDateOfBirth());
            statement.setString(6, employee.getIdCard());
            statement.setString(7, employee.getGender());
            statement.setDouble(8, employee.getSalary());
            statement.setString(9, employee.getPhone());
            statement.setString(10, employee.getEmail());
            statement.setString(11, employee.getAddress());
            statement.setString(12, employee.getId());
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

                String id = resultSet.getString("id_nhan_vien");
                int idViTri = resultSet.getInt("id_vi_tri_lam_viec");
                int idBoPhan = resultSet.getInt("id_bo_phan_nhan_vien");
                int idTrinhDo = resultSet.getInt("id_trinh_do_nhan_vien");
                String name1 = resultSet.getString("ten_nhan_vien");
                String birthday = resultSet.getString("ngay_sinh");
                String idCard = resultSet.getString("so_CMND");
                String gender = resultSet.getString("gioi_tinh");
                Double salary = resultSet.getDouble("luong");
                String phone = resultSet.getString("so_DT");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                Position position = positionRepository.findPositionById(idViTri);
                EducationDegree educationDegree=educationDegreeRepository.findEducationDegreeById(idTrinhDo);
                Division division=divisionRepository.findPositionById(idBoPhan);
                employee.add(new Employee(id, position, educationDegree, division, name1, birthday, idCard, gender, salary, phone, email, address));

            }
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
