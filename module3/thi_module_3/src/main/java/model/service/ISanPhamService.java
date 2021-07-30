package model.service;

import model.bean.SanPham;

import java.util.List;

public interface ISanPhamService {
    public List<SanPham> findAll();
    public String[] create(SanPham sanPham);
    public String[] edit(SanPham sanPham);
    public boolean delete(int id);
    public SanPham findById(int id);
}
