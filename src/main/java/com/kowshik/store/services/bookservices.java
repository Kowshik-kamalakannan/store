package com.kowshik.store.services;

import java.util.List;

import com.kowshik.store.model.Book;
import com.kowshik.store.repsoitory.bookrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;


@Service
public class bookservices{

        @Autowired
        bookrepo repo;
        
        //Insert (insert evertime inserts an object)
        public String savebooks(Book book)
        {
            
            repo.insert(book);
            
            return "Added book with id : " + book.getId();
        }

        //displayall
        public List<Book> findAllbooks()
        {
            return repo.findAll();
        }

        //deletebyid
        public String deleteBooks(int id)
        {
            repo.deleteById(id);
            return "book deleted with id : " + id;
        }

        //updatename(//save if finds id updates the object if not found insert as new)
        public String updatebook(int id,String username)
        {
            Book book=repo.findById(id).get();
		    book.setName(username);
		    repo.save(book);
		    return "Updated name:"+username;
        }

        public List<Book> getbyval(Book book) {
            ExampleMatcher ex=ExampleMatcher.matching();
            Example<Book> e= Example.of(book);
            return repo.findAll(e);
        }



        

        



}
