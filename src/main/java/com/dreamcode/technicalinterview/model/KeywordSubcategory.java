package com.dreamcode.technicalinterview.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "keyword_subcategory")
public class KeywordSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="id_subcategory")
    private long idSubcategory;
    public KeywordSubcategory(){

    }
    public KeywordSubcategory(long id, long idSubcategory) {
        this.id = id;
        this.idSubcategory = idSubcategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdSubcategory() {
        return idSubcategory;
    }

    public void setIdSubcategory(long idSubcategory) {
        this.idSubcategory = idSubcategory;
    }
}
