package com.rest.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.entity.Author;
import com.rest.api.services.AuthorServices;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/api")
public class AuthorContoller {
	
	
	@Autowired
	AuthorServices authorServices;
	
	@GetMapping("/author")
	public List<Author> getAllAuthor(){
		
		return authorServices.getAllAuthor();
	}
}
