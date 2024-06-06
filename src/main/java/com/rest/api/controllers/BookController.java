package com.rest.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.entity.Author;
import com.rest.api.entity.Book;
import com.rest.api.services.BookServices;

@RestController
class BookController {

	@Autowired
	BookServices bookServices;

	@GetMapping("/books")
	public List<Book> getALlBooks() {
		List<Book> allBooks = this.bookServices.getAllBooks();
		return allBooks;
	}

//	@PutMapping("/book")
//	public String putBook(@RequestBody Book book) {
//		String msg = bookServices.addBook(book);
//		return msg;
//		
//	}

	
	@PutMapping("/book")
	public String putBook(@RequestParam String title, @RequestParam String authorFirstName,
			@RequestParam String authorLastName) {
		Author author = new Author();
		author.setFirstName(authorFirstName);
		author.setLastName(authorLastName);

		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);

		String msg = bookServices.addBook(book);
		return msg;
	}

	@GetMapping("/books/{id}")
	public Optional<Book> getMethodName(@PathVariable("id") int id) {
		Optional<Book> book = this.bookServices.getBookById(id);
		return book;
	}

}
