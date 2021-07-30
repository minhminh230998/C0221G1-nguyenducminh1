package com.example.model.service;

import com.example.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);
    Product findById(int id);
    void deleteById(int id);
    void save(Product product);
    Page<Product> findByName(Pageable pageable, String name, String price);
}
