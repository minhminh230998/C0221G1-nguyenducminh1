package model.Repository;

import model.bean.contract.ContractDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContractDetailRepository {
    BaseRepository baseRepository=new BaseRepository();
    final String CREATE_CONTRACT_DETAIL="insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong) values(?,?,?);";
    public void createContractDetail(ContractDetail contractDetail){
        Connection connection=baseRepository.connectDataBase();
        try {
            PreparedStatement statement=connection.prepareStatement(CREATE_CONTRACT_DETAIL);
            statement.setInt(1,contractDetail.getContract().getId());
            statement.setInt(2,contractDetail.getAttachService().getId());
            statement.setInt(3,contractDetail.getQuantity());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
