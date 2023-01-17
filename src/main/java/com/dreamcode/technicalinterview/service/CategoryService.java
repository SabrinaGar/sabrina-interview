package com.dreamcode.technicalinterview.service;

import com.dreamcode.technicalinterview.model.Keyword;

public interface CategoryService {
    ArrayList<Keyword> getKeywordsByCategoryId(long categoryId);
    int getLevelByCategoryId(long categoryId);

}
