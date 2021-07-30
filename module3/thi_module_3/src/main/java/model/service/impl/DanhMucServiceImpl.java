package model.service.impl;

import model.bean.DanhMuc;
import model.repository.DanhMucRepository;
import model.service.IDanhMucService;

import java.util.List;

public class DanhMucServiceImpl implements IDanhMucService {
    DanhMucRepository danhMucRepository=new DanhMucRepository();

    @Override
    public List<DanhMuc> findAll() {
        return danhMucRepository.findAll();
    }

    @Override
    public DanhMuc findById(int id) {
        return danhMucRepository.findById(id);
    }
}
