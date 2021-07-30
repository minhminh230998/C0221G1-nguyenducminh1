package com.example.model.service.impl;

import com.example.model.entity.Question;
import com.example.model.repository.IQuestionRepository;
import com.example.model.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements IQuestionService {
    @Autowired
    IQuestionRepository iQuestionRepository;

    @Override
    public Page<Question> findAll(Pageable pageable) {
        return iQuestionRepository.findAll(pageable);
    }

    @Override
    public Question findById(int id) {
        return iQuestionRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        iQuestionRepository.deleteById(id);
    }

    @Override
    public void save(Question product) {
        iQuestionRepository.save(product);
    }

    @Override
    public Page<Question> findQuestionByTitleAndAndQuestionTypeName(Pageable pageable, String name, String nameQuestionType) {
        return iQuestionRepository.findQuestionByTitleAndAndQuestionTypeName(pageable,name,nameQuestionType);
    }
}
