package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Book;
import com.nt.repo.BookRepository;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private BookRepository repository;

	@Override
	public String upsertBook(Book book) {
		Integer bookInteger = book.getBookId();
		//System.out.println(book);
		 repository.save(book);
		//System.out.println(book);
		if (bookInteger == null) {
			return "Book Inserted";
		} else {
			return "Book Updated";
		}

	}

	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();

	}

	@Override
	public String deleteById(Integer id) {
	       repository.deleteById(id);
		return id+": one record deleted";
	}

}
