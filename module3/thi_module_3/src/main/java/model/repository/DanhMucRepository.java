package model.repository;

import model.bean.DanhMuc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DanhMucRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String SELECT="select* from danh_muc;";
    final String SELECT_BY_ID="select* from danh_muc where id=?;";
    public List<DanhMuc> findAll(){
        List<DanhMuc> danhMucList=new ArrayList<>();
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                danhMucList.add(new DanhMuc(id,name));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhMucList;
    }
    public DanhMuc findById(int id){
        DanhMuc danhMuc=null;
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id1=resultSet.getInt(1);
                String name=resultSet.getString(2);
                danhMuc=new DanhMuc(id1,name);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhMuc;
    }
}
