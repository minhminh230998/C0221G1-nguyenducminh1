package com.example.model.repository;

import com.example.model.entity.Comment;

import java.util.List;

public interface CommentRepository {
    List<Comment> findAll();
    Comment findById(Integer id);
    void save(Comment comment);
    void edit(int id);
}
