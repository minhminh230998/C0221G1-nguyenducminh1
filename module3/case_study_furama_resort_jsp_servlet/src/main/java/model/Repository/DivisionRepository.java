package model.Repository;

import model.bean.employee.Division;
import model.bean.employee.Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String SELECT_DIVISION="select* from trinh_do_nhan_vien;";
    final String SELECT_DIVISION_BY_ID="select* from trinh_do_nhan_vien where id_trinh_do_nhan_vien=?;";
    public List<Division> findAllDivision(){
        List<Division> divisionList=new ArrayList<>();
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_DIVISION);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                divisionList.add(new Division(id,name));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return divisionList;
    }
    public Division findPositionById(int id){
        Division division=null;
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_DIVISION_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id1=resultSet.getInt(1);
                String name=resultSet.getString(2);
                division=new Division(id1,name);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return division;
    }
}
