package com.example.tao_ung_dung_blog.model.service.impl;

import com.example.tao_ung_dung_blog.model.entity.Blog;
import com.example.tao_ung_dung_blog.model.repository.IBlogRepository;
import com.example.tao_ung_dung_blog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id).orElse(null);
    }


    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        iBlogRepository.deleteById(id);
    }


}
