package com.bookstore.bookstore.service;

import java.util.List;

import com.bookstore.bookstore.entity.Category;

public interface CategoryService {

    List<Category> getAllCategory();

    void addCategory(Category categ);

}
