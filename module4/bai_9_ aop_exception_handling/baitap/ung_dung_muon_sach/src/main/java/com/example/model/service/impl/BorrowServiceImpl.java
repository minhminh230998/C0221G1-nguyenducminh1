package com.example.model.service.impl;

import com.example.model.entity.Borrow;
import com.example.model.repository.BorrowRepository;
import com.example.model.service.AmountException;
import com.example.model.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BorrowServiceImpl implements IBorrowService {
    @Autowired
    BorrowRepository borrowRepository;
    @Override
    public void save(Borrow borrow) {
            borrowRepository.save(borrow);
    }

    @Override
    public void delete(int code) {
         borrowRepository.deleteByCode(code);
    }

    @Override
    public Borrow findById(int id) {
        return borrowRepository.findById(id).orElse(null);
    }
    public int getRandom() {
        Random random = new Random();
        int num = random.nextInt(90000) + 10000;
        return num;
    }

    @Override
    public Borrow findByCode(int code) {
        return borrowRepository.findBorrowByCode(code);
    }
}
