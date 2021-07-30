package com.example.model.service.impl;

import com.example.model.entity.Province;
import com.example.model.repository.IProvinceRepository;
import com.example.model.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    IProvinceRepository iProvinceRepository;

    @Override
    public List<Province> findAll() {
        return (List<Province>) iProvinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return iProvinceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        iProvinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        iProvinceRepository.deleteById(id);
    }
}
