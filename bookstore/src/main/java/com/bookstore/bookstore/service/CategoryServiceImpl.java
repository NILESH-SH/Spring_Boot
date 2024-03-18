package com.bookstore.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.entity.Category;
import com.bookstore.bookstore.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired CategoryRepository cr;

    @Override
    public List<Category> getAllCategory() {
        return cr.getAllCategory();
    }

    @Override
    public void addCategory(Category categ) {
        cr.addCategory(categ);
    }
    
}
