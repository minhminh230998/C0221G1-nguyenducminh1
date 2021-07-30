package com.example.model.service.impl;

import com.example.model.entity.Blog;
import com.example.model.repository.IBlogRepository;
import com.example.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

    @Override
    public Page<Blog> findByIdCategory(Pageable pageable,int id) {
        return iBlogRepository.findByIdCategory(pageable,id);
    }

    @Override
    public Page<Blog> findByName(Pageable pageable, String name) {
        return iBlogRepository.findAllByName(pageable,"%"+name+"%");
    }
}
