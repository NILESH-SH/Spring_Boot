package com.bookstore.bookstore.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private int authorId;
    private String aname;
    private int categId;
    
}
