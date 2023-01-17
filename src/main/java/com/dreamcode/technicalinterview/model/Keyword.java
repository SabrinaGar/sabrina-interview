package com.dreamcode.technicalinterview.model;

import javax.persistence.*;

@Entity
@Table(name = "keyword")
public class Keyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private keywordId;
    private String name;

    public Keyword(){

    }

    public Keyword(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
