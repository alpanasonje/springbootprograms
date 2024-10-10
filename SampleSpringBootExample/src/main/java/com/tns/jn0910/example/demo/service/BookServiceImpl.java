package com.tns.jn0910.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.jn0910.example.demo.entity.Author;
import com.tns.jn0910.example.demo.entity.Book;
import com.tns.jn0910.example.demo.repository.AuthorRepository;
import com.tns.jn0910.example.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository repo;

	@Autowired
	AuthorRepository authorRepo;

	@Override
	public void addBook(Book c) {
		repo.save(c);

	}

	@Override
	public List<Book> getAllBooks() {
		return repo.findAll();

	}

	@Override
	public Book getBook(int isbn) {

		return repo.findById(isbn).get();
	}

	@Override
	public void deleteBook(int isbn) {
		repo.deleteById(isbn);

	}

	@Override
	public void updateBook(int isbn, Book c) {
		if (getBook(isbn) != null) {
			repo.save(c);
		}

	}

}
