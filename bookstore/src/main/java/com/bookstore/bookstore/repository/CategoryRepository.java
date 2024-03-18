package com.bookstore.bookstore.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstore.entity.Category;

@Repository
public class CategoryRepository {

    @Autowired JdbcTemplate jdbcTemplate;

    public List<Category> getAllCategory() {
        String sql = "Select * from category";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Category.class));
    }

    public void addCategory(Category categ) {
        String sql = "Insert into Category (categName) values (?)";
        jdbcTemplate.update(sql, categ.getCategName());
    }

    public void deleteById(int id) {
        String sql = "Delete from category where categId = ?";
        jdbcTemplate.update(sql, id);
    }

    public Category updateById(Category categ, int id) {
        String sql = "Update category set categName = ? where categId = ?";
        jdbcTemplate.update(sql, categ.getCategName(),id);
        categ.setCategId(id);
        return categ;
    }

}
