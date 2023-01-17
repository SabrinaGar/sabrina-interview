package com.dreamcode.technicalinterview.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "category")
public class Category extends AbstractRoot{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCategory;

    public Category(){

    }
    public Category(long idCategory, List<Subcategory> subcategories) {
        super();

    }

}
