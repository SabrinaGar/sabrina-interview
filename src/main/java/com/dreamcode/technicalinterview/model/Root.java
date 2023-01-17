package com.dreamcode.technicalinterview.model;

import javax.persistence.*;

@Entity
@Table(name = root)
public class Root extends AbstractRoot {

    public Root(){
    }
    public Root(long id, int subCategoryId) {
        super();
    }


}
