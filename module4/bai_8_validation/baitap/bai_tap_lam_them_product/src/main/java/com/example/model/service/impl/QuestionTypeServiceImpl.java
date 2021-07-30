package com.example.model.service.impl;

import com.example.model.entity.QuestionType;
import com.example.model.repository.IQuestionTypeRepository;
import com.example.model.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionTypeServiceImpl implements IQuestionTypeService {
    @Autowired
    IQuestionTypeRepository iQuestionTypeRepository;
    @Override
    public List<QuestionType> findAll() {
        return (List<QuestionType>) iQuestionTypeRepository.findAll();
    }

    @Override
    public QuestionType findById(int id) {
        return iQuestionTypeRepository.findById(id).orElse(null);
    }
}
