package com.rest.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.api.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
	

}
