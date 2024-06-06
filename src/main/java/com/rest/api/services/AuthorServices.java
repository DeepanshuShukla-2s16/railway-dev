package com.rest.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.dao.AuthorRepository;
import com.rest.api.entity.Author;

@Service
public class AuthorServices {

	@Autowired
	AuthorRepository authorRepository;

	public List<Author> getAllAuthor() {
		return (List<Author>) authorRepository.findAll();
	}
}
