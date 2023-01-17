package com.dreamcode.technicalinterview.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractRoot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
        @Column
        private int keywordId;
        @Column
        private int level;
        @Column
        private String name;
public AbstractRoot(){

}

    public AbstractRoot(long id, int keywordId, int level, String name) {
        this.id = id;
        this.keywordId = keywordId;
        this.level = level;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(int keywordId) {
        this.keywordId = keywordId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
