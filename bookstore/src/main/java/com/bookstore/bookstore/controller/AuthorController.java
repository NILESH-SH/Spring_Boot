package com.bookstore.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstore.entity.Author;
import com.bookstore.bookstore.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
    
    @Autowired AuthorService as;

    @GetMapping
    public List<Author> getAllAuthor(){
        return as.getAllAuthor();
    }
 @PostMapping()
    public String addAuthor(@RequestBody Author author){
        as.addAuthor(author);
        return "Author Added ";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id){
        as.deleteById(id);
        return "Deleted id : "+id;
    }

    @PutMapping("/{id}")
    public Author updateById(@RequestBody Author author, @PathVariable int id){
        return as.updateById(author,id);
    }
    
}
