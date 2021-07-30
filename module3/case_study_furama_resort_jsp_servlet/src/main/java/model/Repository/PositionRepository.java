package model.Repository;

import model.bean.employee.Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String SELECT_POSITION="select* from vi_tri_lam_viec;";
    final String SELECT_POSITION_BY_ID="select* from vi_tri_lam_viec where id_vi_tri_lam_viec=?;";
    public List<Position> findAllPosition(){
        List<Position> positionList=new ArrayList<>();
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_POSITION);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                positionList.add(new Position(id,name));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return positionList;
    }
    public Position findPositionById(int id){
        Position position=null;
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_POSITION_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id1=resultSet.getInt(1);
                String name=resultSet.getString(2);
                position=new Position(id1,name);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return position;
    }
}
