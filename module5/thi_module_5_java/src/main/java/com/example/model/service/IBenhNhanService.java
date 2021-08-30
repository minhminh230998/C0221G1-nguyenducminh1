package com.example.model.service;

import com.example.model.entity.BenhNhan;

import java.util.List;
import java.util.Optional;

public interface IBenhNhanService {
    List<BenhNhan> getAll();
    void edit( BenhNhan benhNhan);
    void delete(Integer id);
    BenhNhan findById(Integer id);

}
