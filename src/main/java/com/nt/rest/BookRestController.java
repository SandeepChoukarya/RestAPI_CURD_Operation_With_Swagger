package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Book;
import com.nt.service.IBookService;

@RestController
public class BookRestController {
	@Autowired
	private IBookService service;

	@PostMapping("/book")
	public ResponseEntity<String> saveBook(@RequestBody Book book) {
		String msg = service.upsertBook(book);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	@PutMapping("/book")
    public ResponseEntity<String> updateBook(@RequestBody Book book){ 
    	String msgString = service.upsertBook(book); 
    	return new ResponseEntity<String>(msgString,HttpStatus.OK);
    	
    } 
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getBooks(){
		List<Book> list = service.getAllBooks();
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	}
	@DeleteMapping("/book/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer id){ 
		 String msgString = service.deleteById(id);
		 return new ResponseEntity<String>(msgString,HttpStatus.OK);
	}
}
