package com.example.model.service;

import com.example.model.entity.Manufacturer;

import java.util.List;

public interface IManufacturerService {
    List<Manufacturer> findAll();
    Manufacturer findById(int id);
            }
