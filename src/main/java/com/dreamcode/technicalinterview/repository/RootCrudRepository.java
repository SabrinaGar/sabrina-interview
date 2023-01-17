package com.dreamcode.technicalinterview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RootCrudRepository extends CrudRepository<Root,long> {
}
