package model.service;

import model.bean.DanhMuc;

import java.util.List;

public interface IDanhMucService {
    public List<DanhMuc> findAll();
    public DanhMuc findById(int id);
}
