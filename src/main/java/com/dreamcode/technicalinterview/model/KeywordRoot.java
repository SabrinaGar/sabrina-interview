package com.dreamcode.technicalinterview.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "keyword_root")
public class KeywordRoot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="id_root")
    private long idRoot;

    public KeywordRoot(){

    }
    public KeywordRoot(long id, long idRoot) {
        this.id = id;
        this.idRoot = idRoot;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdRoot() {
        return idRoot;
    }

    public void setIdRoot(long idRoot) {
        this.idRoot = idRoot;
    }
}
