package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String content;
    private boolean correct;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
    @ManyToOne
    private Test test;

    public Question(){}

    public Question(String content, boolean correct) {
        this.content = content;
        this.correct = correct;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
