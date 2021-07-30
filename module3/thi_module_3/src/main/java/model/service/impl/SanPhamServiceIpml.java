package model.service.impl;

import model.bean.SanPham;
import model.repository.SanPhamRepository;
import model.service.ISanPhamService;

import java.time.Year;
import java.util.List;

public class SanPhamServiceIpml implements ISanPhamService {
    SanPhamRepository sanPhamRepository=new SanPhamRepository();
    @Override
    public List<SanPham> findAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public String[] create(SanPham sanPham) {
        boolean check = true;
        String msgTen = "";
        String msgGia = "";
        String msgSoLuong="";
        String msgMauSac="";

// int id, String ten, String gia, String soLuong, String mauSac, String moTa, DanhMuc danhMuc
        if ("".equals(sanPham.getTen())) {
            msgTen = "Nhap Ten";
            check = false;
        }
        if ("".equals(sanPham.getGia())) {
            msgGia = "Nhap Gia";
            check = false;
        }
        if ("".equals(sanPham.getSoLuong())) {
            msgSoLuong = "Nhap So Luong";
            check = false;
        }
        if ("".equals(sanPham.getMauSac())) {
            msgMauSac = "Nhap Mau";
            check = false;
        }
        if (check) {
            sanPhamRepository.create(sanPham);
        }
        return check ? new String[]{} : new String[]{msgTen,msgGia,msgSoLuong,msgMauSac};
    }

    @Override
    public String[] edit(SanPham sanPham) {
        boolean check = true;
        String msgTen = "";
        String msgGia = "";
        String msgSoLuong="";
        String msgMauSac="";

// int id, String ten, String gia, String soLuong, String mauSac, String moTa, DanhMuc danhMuc
        if ("".equals(sanPham.getTen())) {
            msgTen = "Nhap Ten";
            check = false;
        }
        if ("".equals(sanPham.getGia())) {
            msgGia = "Nhap Gia";
            check = false;
        }
        if ("".equals(sanPham.getSoLuong())) {
            msgSoLuong = "Nhap So Luong";
            check = false;
        }
        if ("".equals(sanPham.getMauSac())) {
            msgMauSac = "Nhap Mau";
            check = false;
        }
        if (check) {
            sanPhamRepository.edit(sanPham);
        }
        return check ? new String[]{} : new String[]{msgTen,msgGia,msgSoLuong,msgMauSac};
    }


    @Override
    public boolean delete(int id) {
        return sanPhamRepository.delete(id);
    }

    @Override
    public SanPham findById(int id) {
        return sanPhamRepository.findById(id);
    }
}
