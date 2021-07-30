package com.example.dto;



import com.example.model.entity.QuestionType;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class QuestionDto {
    private  int id;
    @NotBlank(message = " Not Null")
    @Size(min = 5,max=100,message = "You must enter between 5 and 100 characters")
    private String title;
    @NotBlank(message = " Not Null")
    @Size(min = 10,max=500,message = "You must enter between 10 and 500 characters")
    private String question;
    private String answer;
    private String date_create;
    private String status;
    private QuestionType questionType;

    public QuestionDto() {
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

    public String getDate_create() {
        return date_create;
    }

    public void setDate_create(String date_create) {
        this.date_create = date_create;
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
