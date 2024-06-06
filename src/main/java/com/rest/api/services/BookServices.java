package com.rest.api.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.dao.BookRepository;
import com.rest.api.entity.Book;

@Service
public class BookServices {

	@Autowired
	BookRepository bookRepository;

	
	public String addBook(Book book) {
		bookRepository.save(book);
		return "Book added successfully !!";
	}


	public List<Book> getAllBooks() {
		List<Book> allBooks = (List<Book>) bookRepository.findAll();
		return allBooks;
	}


	public Optional<Book> getBookById(int id) {
		
		 Optional<Book> book =  bookRepository.findById(id);
		
		
		return book;
	}
	
	
}
