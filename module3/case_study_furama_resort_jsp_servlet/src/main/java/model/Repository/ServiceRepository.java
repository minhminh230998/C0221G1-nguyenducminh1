package model.Repository;

import model.bean.service.RentType;
import model.bean.service.Services;
import model.bean.service.ServiceType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository {
    BaseRepository baseRepository = new BaseRepository();
    RentTypeRepository rentTypeRepository=new RentTypeRepository();
    ServiceTypeRepository serviceTypeRepository=new ServiceTypeRepository();
    final String CREATE_SERVICE = "insert into dich_vu(id_dich_vu,id_loai_dich_vu,id_kieu_thue,ten_dich_vu,dien_tich_su_dung,chi_phi_thue,so_nguoi_toi_da,so_tang,tieu_chuan_phong,tien_nghi_khac,dien_tich_ho_boi) values(?,?,?,?,?,?,?,?,?,?,?);";
    final String SELECT_BY_ID = "select * from dich_vu where id_dich_vu=?;";
    final String SELECT_ALL = "select * from dich_vu;";

    public List<Services> findAll() {
        List<Services> service = new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id_dich_vu");
                int idRentType = resultSet.getInt("id_kieu_thue");
                int idServiceType = resultSet.getInt("id_loai_dich_vu");
                String name = resultSet.getString("ten_dich_vu");
                String area = resultSet.getString("dien_tich_su_dung");
                Double cost = resultSet.getDouble("chi_phi_thue");
                int maxPeople = resultSet.getInt("so_nguoi_toi_da");
                String standardRoom = resultSet.getString("tieu_chuan_phong");
                String convenience = resultSet.getString("tien_nghi_khac");
                float poolArea = resultSet.getFloat("dien_tich_ho_boi");
                int numberFloors = resultSet.getInt("so_tang");
                RentType rentType=rentTypeRepository.findRentTypeById(idRentType);
                ServiceType serviceType=serviceTypeRepository.findServiceTypeById(idServiceType);
                service.add(new Services(id,rentType,serviceType,name,area,cost,maxPeople,standardRoom,convenience,poolArea,numberFloors));
//int id, int idRentType, int idServiceType, String name, String area, double cost, int maxPeople, String standardRoom, String convenience, float poolArea, int numberFloors
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return service;
    }

    public Services findById(String id) {

        Services service = null;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);

            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
//id_loai_dich_vu,id_kieu_thue,ten_dich_vu,dien_tich_su_dung,chi_phi_thue,so_nguoi_toi_da,so_tang,tieu_chuan_phong,tien_nghi_khac,dien_tich_ho_boi
//int id, int idRentType, int idServiceType, String name, String area, double cost, int maxPeople, String standardRoom, String convenience, float poolArea, int numberFloors
                String id1 = resultSet.getString("id_dich_vu");
                int idRentType = resultSet.getInt("id_kieu_thue");
                int idServiceType = resultSet.getInt("id_loai_dich_vu");
                String name = resultSet.getString("ten_dich_vu");
                String area = resultSet.getString("dien_tich_su_dung");
                Double cost = resultSet.getDouble("chi_phi_thue");
                int maxPeople = resultSet.getInt("so_nguoi_toi_da");
                String standardRoom = resultSet.getString("tieu_chuan_phong");
                String convenience = resultSet.getString("tien_nghi_khac");
                float poolArea = resultSet.getFloat("dien_tich_ho_boi");
                int numberFloors = resultSet.getInt("so_tang");
                RentType rentType=rentTypeRepository.findRentTypeById(idRentType);
                ServiceType serviceType=serviceTypeRepository.findServiceTypeById(idServiceType);
                service = new Services(id1, rentType, serviceType, name, area, cost, maxPeople, standardRoom, convenience, poolArea, numberFloors);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return service;
    }


    public void createService(Services services) {

        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(CREATE_SERVICE);
            statement.setString(1, services.getId());
            statement.setInt(2, services.getServiceType().getId());
            statement.setInt(3, services.getRentType().getId());
            statement.setString(4, services.getName());
            statement.setString(5, services.getArea());
            statement.setDouble(6, services.getCost());
            statement.setInt(7, services.getMaxPeople());
            statement.setInt(8, services.getNumberFloors());
            statement.setString(9, services.getStandardRoom());
            statement.setString(10, services.getConvenience());
            statement.setFloat(11, services.getPoolArea());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
