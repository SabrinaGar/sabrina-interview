package com.dreamcode.technicalinterview.service;

import com.dreamcode.technicalinterview.model.Keyword;
import com.dreamcode.technicalinterview.repository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryCrudRepository categoryCrudRepository;

    @Override
    public ArrayList<Keyword> getKeywordsByCategoryId(long categoryId) {
        return categoryCrudRepository.findAllKeywordsByCategoryId(categoryId)
    }

    @Override
    public int getCategoryLevelbyCategoryId(long categoryId) {
        return categoryCrudRepository.findByIdOrderBylevel(categoryId);
    }
}
