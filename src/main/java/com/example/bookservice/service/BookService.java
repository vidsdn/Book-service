package com.example.bookservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookservice.entity.Book;
import com.example.bookservice.repository.BookRepository;


@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;

	public List<Book> getBooks() {
		return bookRepo.findAll();
		
	}

	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}

	public Book getBookById(int id) throws Exception {
		Book book = bookRepo.findById(id).orElseThrow(()->new Exception("book Not Available"));
		return book;
	}
	
	

}
