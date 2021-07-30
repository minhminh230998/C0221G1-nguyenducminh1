package com.example.model.service;

import com.example.model.entity.Borrow;

public interface IBorrowService {
    void save(Borrow borrow);
    void delete(int code);
    Borrow findById(int id);
    public int getRandom();
    Borrow findByCode(int code);
}
