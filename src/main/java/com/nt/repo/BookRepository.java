package com.nt.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Book;

public interface BookRepository extends JpaRepository<Book,Serializable> { 
	

}
