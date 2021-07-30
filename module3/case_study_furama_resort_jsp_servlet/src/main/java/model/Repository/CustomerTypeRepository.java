package model.Repository;

import model.bean.contract.Contract;
import model.bean.customer.Customer;
import model.bean.customer.CustomerType;

import javax.servlet.RequestDispatcher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepository {
    final String SELECT_ALL="select* from loai_khach;";
    final String SELECT_BY_ID="select* from loai_khach where id_loai_khach=?;";
    BaseRepository baseRepository=new BaseRepository();
    public List<CustomerType> findAll() {
        List<CustomerType> list=new ArrayList<>();
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                list.add(new CustomerType(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public CustomerType findById(int id) {
        CustomerType customerType=null;
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id1=resultSet.getInt(1);
                String name=resultSet.getString(2);
               customerType= new CustomerType(id1,name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerType;
    }
}
