package com.dreamcode.technicalinterview.model;

import javax.persistence.Column;
@Entity
@Table(name = "category_subcategory")
public class CategorySubcategory {
    @Column
    private long id;
    @Column(name="id_subcategory")
    private long subcategoryId;
}
