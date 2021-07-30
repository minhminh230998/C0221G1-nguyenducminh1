package model.repository;

import model.bean.DanhMuc;
import model.bean.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository {
    BaseRepository baseRepository=new BaseRepository();
    DanhMucRepository danhMucRepository=new DanhMucRepository();

    final String SELECT = "select * from san_pham;";
    final String CREATE = "insert into san_pham(id_danh_muc,ten,gia,so_luong,mau_sac,mo_ta) \n" +
            "values(?,?,?,?,?,?)";
    final String SELECT_BY_ID = "select * from san_pham where id=?;";
    final String DELETE = "delete from san_pham where id=?;";
    final String EDIT = "update san_pham set id_danh_muc=?,ten=?,gia=?,so_luong=?,mau_sac=? where id=?;";

    public List<SanPham> findAll() {
        Connection connection = baseRepository.connectDataBase();
        List<SanPham> sanPhamList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                int idDanhMuc=resultSet.getInt(2);
                String ten = resultSet.getString(3);
                String gia = resultSet.getString(4);
                String soLuong = resultSet.getString(5);
                String mauSac = resultSet.getString(6);
                DanhMuc danhMuc=danhMucRepository.findById(idDanhMuc);
                sanPhamList.add(new SanPham(id, ten, gia,soLuong,mauSac,danhMuc));

//                id_danh_muc int ,
//                ten varchar(50),
//                        gia varchar(50),
//                        so_luong varchar(50),
//                        mau_sac varchar(50),
//                        mo_ta varchar(50),
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPhamList;
    }
    public SanPham findById(int id) {
        SanPham sanPham = null;
        Connection connection = baseRepository.connectDataBase();

        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                int id1 = resultSet.getInt(1);
                int idDanhMuc=resultSet.getInt(2);
                String ten = resultSet.getString(3);
                String gia = resultSet.getString(4);
                String soLuong = resultSet.getString(5);
                String mauSac = resultSet.getString(6);
                DanhMuc danhMuc=danhMucRepository.findById(idDanhMuc);


                sanPham = new SanPham(id1, ten, gia,soLuong,mauSac,danhMuc);

            }
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPham;
    }
    public boolean delete(int id) {
        boolean rowDelete = false;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE);
            statement.setInt(1, id);
            rowDelete = statement.executeUpdate() > 0;
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }
    public void create(SanPham sanPham) {
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(CREATE);
//            id_danh_muc,ten,gia,so_luong,mau_sac
            statement.setInt(1, sanPham.getDanhMuc().getId());
            statement.setString(2,sanPham.getTen());
            statement.setString(3,sanPham.getGia());
            statement.setString(4,sanPham.getSoLuong());
            statement.setString(5,sanPham.getMauSac());
            statement.setString(6,sanPham.getMoTa());
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean edit(SanPham sanPham) {

        boolean check = false;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(EDIT);
            statement.setInt(1, sanPham.getDanhMuc().getId());
            statement.setString(2,sanPham.getTen());
            statement.setString(3,sanPham.getGia());
            statement.setString(4,sanPham.getSoLuong());
            statement.setString(5,sanPham.getMauSac());
            statement.setInt(6,sanPham.getId());

            check = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

}
