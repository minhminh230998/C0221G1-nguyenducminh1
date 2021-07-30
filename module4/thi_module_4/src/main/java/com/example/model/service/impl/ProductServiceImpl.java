package com.example.model.service.impl;

import com.example.model.entity.Product;
import com.example.model.repository.IProductRepository;
import com.example.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepository iProductRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public Product findById( int id) {
        return iProductRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Page<Product> findByName(Pageable pageable, String name,String price) {
        return iProductRepository.findByName(pageable,name,price);
    }
}
