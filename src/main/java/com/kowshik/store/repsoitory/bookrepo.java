package com.kowshik.store.repsoitory;

import com.kowshik.store.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface bookrepo extends MongoRepository<Book,Integer>{
    
    
}
