package model.Repository;

import model.bean.employee.Division;
import model.bean.employee.EducationDegree;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationDegreeRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String SELECT_EDUCATION_DEGREE="select* from bo_phan_nhan_vien;";
    final String SELECT_EDUCATION_DEGREE_BY_ID="select* from bo_phan_nhan_vien where id_bo_phan_nhan_vien=?;";
    public List<EducationDegree> findAllEducationDegree(){
        List<EducationDegree> educationDegreeList=new ArrayList<>();
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_EDUCATION_DEGREE);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                educationDegreeList.add(new EducationDegree(id,name));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return educationDegreeList;
    }
    public EducationDegree findEducationDegreeById(int id){
        EducationDegree educationDegree=null;
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_EDUCATION_DEGREE_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id1=resultSet.getInt(1);
                String name=resultSet.getString(2);
                educationDegree=new EducationDegree(id1,name);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return educationDegree;
    }
}
