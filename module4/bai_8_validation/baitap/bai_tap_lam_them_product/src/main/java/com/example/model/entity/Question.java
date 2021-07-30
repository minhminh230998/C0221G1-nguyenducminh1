package com.example.model.entity;

import javax.persistence.*;

@Entity(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String title;
    private String question;
    private String answer;
    @Column( columnDefinition = "date")
    private String dateCreate;
    private String status;
    @ManyToOne
    @JoinColumn(name = "question_type_id",referencedColumnName = "id")
    private QuestionType questionType;

    public Question() {
    }

    public Question(int id, String title, String question, String answer, String dateCreate, String status, QuestionType questionType) {
        this.id = id;
        this.title = title;
        this.question = question;
        this.answer = answer;
        this.dateCreate = dateCreate;
        this.status = status;
        this.questionType = questionType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
