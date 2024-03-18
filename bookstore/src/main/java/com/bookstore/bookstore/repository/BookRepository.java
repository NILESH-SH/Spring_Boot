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
        String sql = "Select * from BookTable";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Books.class));
    }

}
