package com.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int amount;
    @OneToMany(mappedBy = "book")
    private List<Borrow> borrows;

    public Book(int id, String name, int amount, List<Borrow> borrows) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.borrows = borrows;
    }

    public Book(int id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Borrow> getBorrows() {
        return borrows;
    }

    public void setBorrows(List<Borrow> borrows) {
        this.borrows = borrows;
    }
}
