package com.bookstore.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstore.entity.Category;
import com.bookstore.bookstore.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
    
    @Autowired CategoryService cs;

    @GetMapping()
    public List<Category> getAllCategory(){
        return cs.getAllCategory();
    }

    @PostMapping()
    public String getAllCategory(@RequestBody Category categ){
        cs.addCategory(categ);
        return "Category Added ";
    }
}
