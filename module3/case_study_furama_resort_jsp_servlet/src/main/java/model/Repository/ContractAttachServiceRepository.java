package model.Repository;



import model.bean.customerService.AttachServiceContract;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractAttachServiceRepository {
    final String SELECT_ATTACH_SERVICE="select * from v_hop_dong_dich_vu_di_kem;";
    BaseRepository baseRepository=new BaseRepository();
    public List<AttachServiceContract> findAll(){
        List<AttachServiceContract> attachServiceContracts=new ArrayList<>();
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(SELECT_ATTACH_SERVICE);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){

                String idContract=resultSet.getString(1);
                String idAttachService=resultSet.getString(2);
                String nameAttachService=resultSet.getString(3);
                attachServiceContracts.add(new AttachServiceContract(idContract,nameAttachService,idAttachService));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attachServiceContracts;
    }
}
