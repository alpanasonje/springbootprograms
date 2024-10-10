package com.tns.jn0910.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.jn0910.example.demo.entity.Author;
import com.tns.jn0910.example.demo.entity.Book;
import com.tns.jn0910.example.demo.repository.AuthorRepository;
import com.tns.jn0910.example.demo.repository.BookRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorRepository repo;

	@Autowired
	BookRepository bookRepo;
	@Override
	public void addAuthor(Author c) {

		repo.save(c);
		
	}

	@Override
	public List<Author> getAllAuthors() {
		return repo.findAll();

	}

	@Override
	public Author getAuthor(int id) {

		return repo.findById(id).get();
	}

	@Override
	public void deleteAuthor(int id) {
		repo.deleteById(id);

	}

	@Override
	public void updateAuthor(int id, Author c) {
		if (getAuthor(id) != null)
		{
			repo.save(c);
		}

	}

}
