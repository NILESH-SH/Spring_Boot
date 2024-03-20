package com.bookstore.bookstore.service;

import java.util.List;

import com.bookstore.bookstore.entity.Books;

public interface BookService {

    List<Books> getAllBooks();

    void addBook(Books books);

    void deleteById(int id);

    Books updateById(Books books, int id);
    
}
