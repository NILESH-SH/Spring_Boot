package com.bookstore.bookstore.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstore.controller.Author;

@Repository
public class AuthorRepository {

    @Autowired JdbcTemplate jdbcTemplate;

    public List<Author> getAllAuthor() {
        String sql = "Select * from author";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Author.class));
    }

}
