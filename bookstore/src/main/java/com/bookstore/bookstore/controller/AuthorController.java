package com.bookstore.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bookstore.bookstore.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
    
    @Autowired AuthorService as;

    @GetMapping
    public List<Author> getAllAuthor(){
        return as.getAllAuthor();
    }
}
