package com.example.model.service.impl;

import com.example.model.entity.BenhNhan;
import com.example.model.repository.BenhNhanRepository;
import com.example.model.service.IBenhNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BenhNhanServiceImpl implements IBenhNhanService {
    @Autowired
    BenhNhanRepository benhNhanRepository;

    @Override
    public List<BenhNhan> getAll() {
        return (List<BenhNhan>) benhNhanRepository.findAll();
    }

    @Override
    public void edit(BenhNhan benhNhan) {
      benhNhanRepository.save(benhNhan);
    }

    @Override
    public void delete(Integer id) {
        benhNhanRepository.deleteById(id);
    }

    @Override
    public BenhNhan findById(Integer id) {
        return benhNhanRepository.findById(id).orElse(null);
    }
}
