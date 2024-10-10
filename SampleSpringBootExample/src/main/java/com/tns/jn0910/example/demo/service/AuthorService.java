package com.tns.jn0910.example.demo.service;

import java.util.List;

import com.tns.jn0910.example.demo.entity.Author;

public interface AuthorService {
	void addAuthor(Author a);

	List<Author> getAllAuthors();

	Author getAuthor(int id);

	void deleteAuthor(int id);

	void updateAuthor(int id, Author a);

}
