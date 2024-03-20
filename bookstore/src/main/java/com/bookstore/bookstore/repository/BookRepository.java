package com.bookstore.bookstore.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstore.entity.Books;

@Repository
public class BookRepository {
    
    @Autowired JdbcTemplate jdbcTemplate;

    public List<Books> getAllBooks() {
        String sql = "Select * from Books";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Books.class));
    }

    public void addBook(Books books) {
        String sql = "Insert into Books (name,price,authorId,categId) values (?,?,?,?)";
        jdbcTemplate.update(sql, books.getName(),books.getPrice(),books.getAuthorId(),books.getCategId());
    }

    public void deleteById(int id) {
        String sql = "Delete from books where bookId = ?";
        jdbcTemplate.update(sql, id);
    }

    public Books updateById(Books books, int id) {
        String sql = "Update books set name=?,price=?,authorId=?,categId=?, categName = ? where bookId = ?";
        jdbcTemplate.update(sql, books.getName(),books.getPrice(),books.getAuthorId(),books.getCategId(),id);
        books.setCategId(id);
        return books;
    }

}
