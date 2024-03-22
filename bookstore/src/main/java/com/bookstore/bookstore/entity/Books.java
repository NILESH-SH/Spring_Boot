package com.bookstore.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Books {

    private int BookId;
    private String name;
    private double price;
    private int authorId;
    private int categId;    

}
