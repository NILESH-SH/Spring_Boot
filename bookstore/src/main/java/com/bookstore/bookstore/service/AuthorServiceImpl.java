package com.bookstore.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.entity.Author;
import com.bookstore.bookstore.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired AuthorRepository ar;

    @Override
    public List<Author> getAllAuthor() {
        return ar.getAllAuthor();
    }

  
    @Override
    public void addAuthor(Author author) {
        ar.addCategory(author);
    }

    @Override
    public void deleteById(int id) {
        ar.deleteById(id);
    }

    @Override
    public Author updateById(Author author, int id) {
        return ar.updateById(author,id);
    }
    
}
