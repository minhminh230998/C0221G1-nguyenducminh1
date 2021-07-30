package com.example.model.service;

import com.example.model.entity.QuestionType;

import java.util.List;

public interface IQuestionTypeService {
    List<QuestionType> findAll();
    QuestionType findById(int id);
            }
