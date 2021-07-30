package model.Repository;

import model.bean.contract.Contract;
import model.bean.customer.Customer;
import model.bean.employee.Employee;
import model.bean.service.Services;
import model.service.ICustomerService;
import model.service.IEmployeeService;
import model.service.IService;
import model.service.impl.CustomerServiceimpl;
import model.service.impl.EmployeeService;
import model.service.impl.ServiceServiceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository {
    ICustomerService iCustomerService = new CustomerServiceimpl();
    IEmployeeService iEmployeeService = new EmployeeService();
    IService iService = new ServiceServiceimpl();
    BaseRepository baseRepository = new BaseRepository();
    final String INSERT_CONTRACT = "insert into hop_dong(id_khach_hang,id_nhan_vien,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,so_tien_coc_truoc) values(?,?,?,?,?,?);";
    final String SELECT_BY_ID = "select * from hop_dong where id_hop_dong=?;";
    final String SELECT_ALL = "select * from hop_dong;";
final String UPDATE_CONTRACT="update hop_dong set hop_dong.id_dich_vu=? where id_hop_dong=?;";
    public void createContract(Contract contract) {
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_CONTRACT);
            statement.setString(1, contract.getCustomer().getId());
            statement.setString(2, contract.getEmployee().getId());
            statement.setString(3, contract.getServices().getId());
            statement.setString(4, contract.getStartDate());
            statement.setString(5, contract.getEndDate());
            statement.setString(5, contract.getEndDate());
            statement.setDouble(6, contract.getDeposit());
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Contract findById(int id) {
        Contract contract = null;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id_hop_dong");
                String idCustomer = resultSet.getString("id_khach_hang");
                String idEmployee = resultSet.getString("id_nhan_vien");
                String idService = resultSet.getString("id_dich_vu");
                String startDate = resultSet.getString("ngay_lam_hop_dong");
                String endDate = resultSet.getString("ngay_ket_thuc");
                Double deposit = resultSet.getDouble("so_tien_coc_truoc");
                Customer customer = iCustomerService.findById(idCustomer);
                Employee employee = iEmployeeService.findById(idEmployee);
                Services services = iService.findById(idService);

                contract = new Contract(id1, startDate, endDate, deposit, employee, customer, services);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contract;
    }

    public List<Contract> findAll() {
        List<Contract> contract = new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id_hop_dong");
                String idCustomer = resultSet.getString("id_khach_hang");
                String idEmployee = resultSet.getString("id_nhan_vien");
                String idService = resultSet.getString("id_dich_vu");
                String startDate = resultSet.getString("ngay_lam_hop_dong");
                String endDate = resultSet.getString("ngay_ket_thuc");
                Double deposit = resultSet.getDouble("so_tien_coc_truoc");
                Customer customer = iCustomerService.findById(idCustomer);
                Employee employee = iEmployeeService.findById(idEmployee);
                Services services = iService.findById(idService);

                contract.add(new Contract(id1, startDate, endDate, deposit, employee, customer, services));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contract;
    }
    public boolean editContract(Contract contract) {
        boolean check = false;
        Connection connection = baseRepository.connectDataBase();
        try {

            PreparedStatement statement = connection.prepareStatement(UPDATE_CONTRACT);
            statement.setString(1, contract.getServices().getId());
            statement.setInt(2, contract.getId());


            check = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }
}
