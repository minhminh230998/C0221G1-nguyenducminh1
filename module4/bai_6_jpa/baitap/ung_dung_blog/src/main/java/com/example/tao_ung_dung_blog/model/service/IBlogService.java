package com.example.tao_ung_dung_blog.model.service;

import com.example.tao_ung_dung_blog.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(int id);

    void save(Blog blog);

    void remove(int id);
}
