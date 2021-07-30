package com.example.model.service.impl;

import com.example.model.bean.Product;
import com.example.model.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements IProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone 5", 1000, "Con hang", "Iphone"));
        products.put(2, new Product(2, "Iphone Xsmax", 2000, "Con hang", "Iphone"));
        products.put(3, new Product(3, "Iphone 8", 3000, "Con hang", "Iphone"));
        products.put(4, new Product(4, "Iphone X", 4000, "Con hang", "Iphone"));
        products.put(5, new Product(5, "Iphone 11", 5000, "Con hang", "Iphone"));
        products.put(6, new Product(6, "Iphone 12", 6000, "Con hang", "Iphone"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void createProduct(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void deleteProduct(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>(products.values());
        List<Product> search = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                search.add(product);
            }
        }
        return search;
    }
}
