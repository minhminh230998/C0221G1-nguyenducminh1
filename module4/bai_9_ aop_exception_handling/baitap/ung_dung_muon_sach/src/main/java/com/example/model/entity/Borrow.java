package com.example.model.entity;

import javax.persistence.*;

@Entity(name = "borrow")
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int code;
    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;

    public Borrow(int id, int code, Book book) {
        this.id = id;
        this.code = code;
        this.book = book;
    }

    public Borrow(int code, Book book) {
        this.code = code;
        this.book = book;
    }

    public Borrow() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
