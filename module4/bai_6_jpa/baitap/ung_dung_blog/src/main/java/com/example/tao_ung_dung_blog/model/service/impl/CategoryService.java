package com.example.tao_ung_dung_blog.model.service.impl;

import com.example.tao_ung_dung_blog.model.entity.Blog;
import com.example.tao_ung_dung_blog.model.entity.Category;
import com.example.tao_ung_dung_blog.model.repository.ICategoryRepository;
import com.example.tao_ung_dung_blog.model.service.ICategoryService;
import org.aspectj.bridge.ICommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return (List<Category>) iCategoryRepository.findAll();
    }

    @Override
    public Category findById(int id) {
        return iCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public void remove(int id) {
        iCategoryRepository.deleteById(id);
    }
}
