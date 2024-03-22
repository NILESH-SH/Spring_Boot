package com.bookstore.bookstore.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.entity.Books;
import com.bookstore.bookstore.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository br;

    @Override
    public List<Books> getAllBooks() {
        return br.getAllBooks();
    }

    @Override
    public void addBook(Books books) {
        br.addBook(books);
    }

    @Override
    public void deleteById(int id) {
        br.deleteById(id);
    }

    @Override
    public Books updateById(Books books, int id) {
        return br.updateById(books, id);
    }

    @Override
    public List<Books> sortBooksAccToField(String field) {
        List<Books> b = br.getAllBooks();
        if (field.equals("name")) {
            Collections.sort(b, Comparator.comparing(Books::getName));
        } else if (field.equals("price")) {
            Collections.sort(b, Comparator.comparingInt(Books::getCategId));
            System.out.println(b);
        } else if (field.equals("author")) {
            Collections.sort(b, Comparator.comparingInt(Books::getCategId));
        } else if (field.equals("category")) {
            Collections.sort(b, Comparator.comparingInt(Books::getCategId));
        } else {
            return null;
        }
        return b;
    }

    @Override
    public List<Books> getBookByName(String string) {
        return br.getBookByName(string);
    }

}
