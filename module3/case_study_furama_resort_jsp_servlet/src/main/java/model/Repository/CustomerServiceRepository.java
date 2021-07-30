package model.Repository;

import controller.CustomerServlet;
import model.bean.customer.Customer;
import model.bean.customer.CustomerType;
import model.bean.customerService.CustomerService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CustomerServiceRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String SELECT_CUSTOMER_SERVICE="select * from v_khach_hang_dich_vu;";
    final String SELECT_BY_NAME="  select * from v_khach_hang_dich_vu where ten_khach_hang like ?;";
    public List<CustomerService> findAll(){
        Connection connection=baseRepository.connectDataBase();
        List<CustomerService> customerServiceList=new ArrayList<>();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_CUSTOMER_SERVICE);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                String nameCustomer=resultSet.getString(1);
                String startDate=resultSet.getString(2);
                String endDate=resultSet.getString(3);
                String nameService=resultSet.getString(4);
                String idContract=resultSet.getString(5);
                customerServiceList.add(new CustomerService(nameCustomer,startDate,endDate,nameService,idContract));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerServiceList;
    }
    public List<CustomerService> findByName(String name) {
        List<CustomerService> customerServiceList = new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_NAME);
            statement.setString(1,"%"+ name+"%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String nameCustomer=resultSet.getString(1);
                String startDate=resultSet.getString(2);
                String endDate=resultSet.getString(3);
                String nameService=resultSet.getString(4);
                String idContract=resultSet.getString(5);
                customerServiceList.add(new CustomerService(nameCustomer,startDate,endDate,nameService,idContract));

            }
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerServiceList;
    }
}
