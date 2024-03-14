package com.nt.service;

import java.util.List;

import com.nt.entity.Book;

public interface IBookService {
 
	public String upsertBook(Book book); 
    
	public List<Book> getAllBooks();
	
	public String deleteById(Integer id);
}
