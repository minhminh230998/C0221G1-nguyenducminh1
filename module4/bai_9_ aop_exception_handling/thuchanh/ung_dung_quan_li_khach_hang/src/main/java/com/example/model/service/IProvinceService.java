package com.example.model.service;

import com.example.model.entity.Province;

import java.util.List;

public interface IProvinceService {
    List<Province> findAll();
    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
