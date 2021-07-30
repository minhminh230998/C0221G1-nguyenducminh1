package com.example.model.service;

import com.example.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(int id);

    void save(Blog blog);

    void remove(int id);
    Page<Blog>findByIdCategory(Pageable pageable,int id);
    Page<Blog>findByName(Pageable pageable,String name);
}
