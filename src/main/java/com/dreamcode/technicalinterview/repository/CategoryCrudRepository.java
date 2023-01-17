package com.dreamcode.technicalinterview.repository;

import com.dreamcode.technicalinterview.model.Keyword;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryCrudRepository extends CrudRepository<Category,long>{
    @Query( value="SELECT id FROM  keyword_category AS WHERE id_category = ?", nativeQuery = true)
    Collection<KeywordCategory> findAllKeywordsByCategoryId(long categoryId);
    @Query( value="SELECT level FROM  category WHERE id_category = ?", nativeQuery = true)
    int findLevelbyCategoryId(long categoryId)
}
