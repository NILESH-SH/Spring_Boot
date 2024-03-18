package com.bookstore.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.controller.Author;
import com.bookstore.bookstore.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired AuthorRepository ar;

    @Override
    public List<Author> getAllAuthor() {
        return ar.getAllAuthor();
    }
    
}
