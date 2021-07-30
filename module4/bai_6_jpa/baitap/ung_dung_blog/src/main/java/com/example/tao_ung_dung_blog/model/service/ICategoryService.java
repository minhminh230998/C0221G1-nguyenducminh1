package com.example.tao_ung_dung_blog.model.service;

import com.example.tao_ung_dung_blog.model.entity.Blog;
import com.example.tao_ung_dung_blog.model.entity.Category;

import java.awt.print.Pageable;
import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findById(int id);

    void save(Category category);

    void remove(int id);
}
