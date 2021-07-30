package model.Repository;

import model.bean.employee.Division;
import model.bean.service.RentType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentTypeRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String SELECT_RENT_TYPE="select* from kieu_thue;";
    final String SELECT_RENT_TYPE_BY_ID="select* from kieu_thue where id_kieu_thue=?;";
    public List<RentType> findAllRentType(){
        List<RentType> rentTypes=new ArrayList<>();
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_RENT_TYPE);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                Double cost=resultSet.getDouble(3);
                rentTypes.add(new RentType(id,name,cost));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentTypes;
    }
    public RentType findRentTypeById(int id){
        RentType rentType=null;
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_RENT_TYPE_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id1=resultSet.getInt(1);
                String name=resultSet.getString(2);
                Double cost=resultSet.getDouble(3);
                rentType=new RentType(id1,name,cost);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentType;
    }
}
