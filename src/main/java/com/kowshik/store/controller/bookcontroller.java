package com.kowshik.store.controller;

import java.util.List;

import com.kowshik.store.model.Book;
import com.kowshik.store.services.bookservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class bookcontroller {
    
	@Autowired
	bookservices ser;

    @PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
        return ser.savebooks(book);
	}

    @GetMapping("/findAllBooks")
	public List<Book> getBooks() {
		return ser.findAllbooks();
	}

	//request param takes id eventhough it is encoded,but pathvariable takes as such given in url
    @DeleteMapping("/delete")
	public String deleteBook(@RequestParam("id") int id) {
		return ser.deleteBooks(id);
		
	}
	@PutMapping("/update/{id}/{name}")
	public String updateBookName(@PathVariable("id") int id,@PathVariable("name") String username)
	{
		return ser.updatebook(id,username);
	}

	@GetMapping("/getbyname")
	public List<Book> getbyvalues(@RequestBody Book book)
	{
		return ser.getbyval(book);
	}
    
}
