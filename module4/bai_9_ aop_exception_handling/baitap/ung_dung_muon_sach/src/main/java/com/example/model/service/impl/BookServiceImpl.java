package com.example.model.service.impl;

import com.example.model.entity.Book;
import com.example.model.repository.BookRepository;
import com.example.model.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }
}
