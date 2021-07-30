package model.service.impl;

import model.bean.Product;
import model.repository.ProductRepository;
import model.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository products = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return products.findAll();
    }

    @Override
    public void create(int id, Product product) {
        products.create(id, product);
    }

    @Override
    public void update(int id, Product product) {
        products.update(id, product);
    }

    @Override
    public void remove(int id) {
products.remove(id);
    }

    @Override
    public Product findById(int id) {
        return products.findById(id);
    }

    @Override
    public List<Product> search(String name) {
        return products.search(name);
    }
}
