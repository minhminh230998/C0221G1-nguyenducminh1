package com.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "question_type")
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "questionType")
    List<Question> questions;

    public QuestionType() {
    }

    public QuestionType(int id, String name, List<Question> questions) {
        this.id = id;
        this.name = name;
        this.questions = questions;
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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
