package com.bookstore.bookstore.service;

import java.util.List;

import com.bookstore.bookstore.entity.Author;

public interface AuthorService {

    public List<Author> getAllAuthor();

    public void addAuthor(Author author);

    public void deleteById(int id);

    public Author updateById(Author author, int id);

}
