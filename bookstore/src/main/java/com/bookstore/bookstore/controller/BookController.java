package com.bookstore.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstore.entity.Books;
import com.bookstore.bookstore.service.BookService;


@RestController
@RequestMapping("books")
public class BookController {
    
    @Autowired BookService bs;

    @GetMapping("allbooks")
    public List<Books> getAllBooks() {
       return bs.getAllBooks();
    }
    

}
