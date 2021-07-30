package model.Repository;

import model.bean.contract.AttachService;

import javax.servlet.RequestDispatcher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AttachServiceRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String SELECT_BY_ID="select *from dich_vu_di_kem where id_dich_vu_di_kem=?;";
    final String SELECT_ALL="select *from dich_vu_di_kem;";
    public AttachService finById(int id){
        AttachService attachService=null;
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id1=resultSet.getInt("id_dich_vu_di_kem");
                String name=resultSet.getString("ten_dich_vu_di_kem");
                double cost=resultSet.getDouble("gia");
                int unit=resultSet.getInt("don_vi");
                String status=resultSet.getString("trang_thai");
                attachService=new AttachService(id1,name,cost,unit,status);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attachService;
    }


    public List<AttachService> findAll(){
        List<AttachService> attachService=new ArrayList<>();
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id_dich_vu_di_kem");
                String name=resultSet.getString("ten_dich_vu_di_kem");
                double cost=resultSet.getDouble("gia");
                int unit=resultSet.getInt("don_vi");
                String status=resultSet.getString("trang_thai");
                attachService.add(new AttachService(id,name,cost,unit,status));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attachService;
    }
}
