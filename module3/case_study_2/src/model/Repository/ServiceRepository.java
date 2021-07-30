package model.Repository;

import model.bean.service.House;
import model.bean.service.Room;
import model.bean.service.Services;
import model.bean.service.Villa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServiceRepository {
    BaseRepository baseRepository = new BaseRepository();
    final String CREATE_SERVICE = "insert into dich_vu(id_loai_dich_vu,id_kieu_thue,ten_dich_vu,dien_tich_su_dung,chi_phi_thue,so_nguoi_toi_da,so_tang,tieu_chuan_phong,tien_nghi_khac,dien_tich_ho_boi) values(?,?,?,?,?,?,?,?,?,?);";

    public void createVilla(Villa villa) {

        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(CREATE_SERVICE);
            statement.setInt(1, villa.getIdServiceType());
            statement.setInt(2, villa.getIdRentType());
            statement.setString(3, villa.getName());
            statement.setString(4, villa.getArea());
            statement.setDouble(5, villa.getCost());
            statement.setInt(6, villa.getMaxPeople());
            statement.setInt(7, villa.getNumberFloors());
            statement.setString(8, villa.getStandardRoom());
            statement.setString(9, villa.getConvenience());
            statement.setFloat(10, villa.getPoolArea());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void createHouse(House house) {

        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(CREATE_SERVICE);
            statement.setInt(1, 2);
            statement.setInt(2, house.getIdRentType());
            statement.setString(3, house.getName());
            statement.setString(4, house.getArea());
            statement.setDouble(5, house.getCost());
            statement.setInt(6, house.getMaxPeople());
            statement.setInt(7, house.getNumberFloors());
            statement.setString(8, house.getStandardRoom());
            statement.setString(9, house.getConvenience());
            statement.setString(10, null);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createRoom(Room room) {

        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(CREATE_SERVICE);
            statement.setInt(1, room.getIdServiceType());
            statement.setInt(2, room.getIdRentType());
            statement.setString(3, room.getName());
            statement.setString(4, room.getArea());
            statement.setDouble(5, room.getCost());
            statement.setInt(6, room.getMaxPeople());
            statement.setString(7, null);
            statement.setString(8, null);
            statement.setString(9, null);
            statement.setString(10, null);
            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
