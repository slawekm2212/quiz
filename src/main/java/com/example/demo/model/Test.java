package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Test {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //  mappedBy = "test" wskazuje na klucz ktory jest przechowywany w
    // Question{Test test()}:
    @OneToMany(mappedBy = "test")
    //nazwa klucza obcego po drugiej stronie
    private List<Question> questionList = new ArrayList<>();

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    private String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
