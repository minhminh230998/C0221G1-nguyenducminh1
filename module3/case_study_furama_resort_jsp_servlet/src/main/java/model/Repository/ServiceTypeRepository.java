package model.Repository;

import model.bean.service.ServiceType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceTypeRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String SELECT_SERVICE_TYPE="select* from loai_dich_vu;";
    final String SELECT_SERVICE_TYPE_BY_ID="select* from loai_dich_vu where id_loai_dich_vu=?;";
    public List<ServiceType> findAllServiceType(){
        List<ServiceType> serviceTypes=new ArrayList<>();
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_SERVICE_TYPE);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                serviceTypes.add(new ServiceType(id,name));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceTypes;
    }
    public ServiceType findServiceTypeById(int id){
        ServiceType serviceType=null;
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_SERVICE_TYPE_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int id1=resultSet.getInt(1);
                String name=resultSet.getString(2);
                serviceType=new ServiceType(id1,name);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceType;
    }
}
