package com.bookstore.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.entity.Books;
import com.bookstore.bookstore.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    @Autowired BookRepository br;

    @Override
    public List<Books> getAllBooks() {
        return br.getAllBooks();
    }
    
}
