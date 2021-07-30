package com.example.model.service.impl;

import com.example.model.entity.Comment;
import com.example.model.repository.CommentRepository;
import com.example.model.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findById(Integer id) {
        return commentRepository.findById(id);
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void edit(int id) {
        commentRepository.edit(id);
    }
}
