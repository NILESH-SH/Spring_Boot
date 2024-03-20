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

import com.bookstore.bookstore.entity.Books;
import com.bookstore.bookstore.service.BookService;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    BookService bs;

    @GetMapping()
    public List<Books> getAllBooks() {
        return bs.getAllBooks();
    }

    @PostMapping()
    public String addBook(@RequestBody Books books) {
        bs.addBook(books);
        return "Books Added ";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) {
        bs.deleteById(id);
        return "Deleted id : " + id;
    }

    @PutMapping("/{id}")
    public Books updateById(@RequestBody Books books, @PathVariable int id) {
        return bs.updateById(books, id);
    }
}
