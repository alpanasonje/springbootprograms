package com.tns.jn0910.example.demo.service;

import java.util.List;

import com.tns.jn0910.example.demo.entity.Book;

public interface BookService {
	void addBook(Book bk);

	List<Book> getAllBooks();

	Book getBook(int isbn);

	void deleteBook(int isbn);

	void updateBook(int isbn, Book bk);

}
