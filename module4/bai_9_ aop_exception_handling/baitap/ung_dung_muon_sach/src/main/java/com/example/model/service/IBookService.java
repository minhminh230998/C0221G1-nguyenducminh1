package com.example.model.service;

import com.example.model.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    void save(Book book);
    Book findById(int id);
}
