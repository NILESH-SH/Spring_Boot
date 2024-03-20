package com.bookstore.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Author {
    
    private int authorId;
    private String aname;
    private int categId;
}
