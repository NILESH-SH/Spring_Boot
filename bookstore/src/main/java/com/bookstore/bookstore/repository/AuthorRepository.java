package com.bookstore.bookstore.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstore.entity.Author;

@Repository
public class AuthorRepository {

    @Autowired JdbcTemplate jdbcTemplate;

    public List<Author> getAllAuthor() {
        String sql = "Select * from author";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Author.class));
    }

    public void addCategory(Author author) {
        String sql = "Insert into author (aname,categId) values (?,?)";
        jdbcTemplate.update(sql, author.getAname(),author.getCategId());
    }

    public void deleteById(int id) {
        String sql = "Delete from author where authorId = ?";
        jdbcTemplate.update(sql, id);
    }

    public Author updateById(Author author, int id) {
        String sql = "Update author set aname = ?,categId = ? where authorId = ?";
        jdbcTemplate.update(sql, author.getAname(),author.getCategId(),id);
        author.setAuthorId(id);
        return author;
    }

}
