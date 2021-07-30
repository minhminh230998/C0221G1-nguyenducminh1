package com.example.model.service;

import com.example.model.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
    void createProduct(Product product);
    void updateProduct(int id, Product product);
    void deleteProduct(int id);
    List<Product> findByName(String name);
}
