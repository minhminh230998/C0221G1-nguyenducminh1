package com.example.model.service;

import com.example.model.entity.Comment;

import java.sql.Connection;
import java.util.List;

public interface CommentService {
    List<Comment> findAll();

    Comment findById(Integer id);

    void save(Comment comment);
    void edit(int id);
}
