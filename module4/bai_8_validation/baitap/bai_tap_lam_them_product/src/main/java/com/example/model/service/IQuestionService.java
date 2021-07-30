package com.example.model.service;

import com.example.model.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IQuestionService {
    Page<Question> findAll(Pageable pageable);
    Question findById(int id);
    void deleteById(int id);
    void save(Question product);
    Page<Question> findQuestionByTitleAndAndQuestionTypeName(Pageable pageable, String name, String nameQuestionType);
}
