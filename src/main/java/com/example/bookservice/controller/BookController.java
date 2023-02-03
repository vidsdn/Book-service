package com.example.bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookservice.entity.Book;
import com.example.bookservice.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
    private BookService bookService;
	
	@PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping
    public List<Book> findBooks() {
        return bookService.getBooks();
    }


    @GetMapping("/{id}")
    public Book findBook(@PathVariable int id) throws Exception {
        Book book = bookService.getBookById(id);
        return book;
    }

}
