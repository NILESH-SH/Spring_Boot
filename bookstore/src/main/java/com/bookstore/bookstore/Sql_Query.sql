CREATE DATABASE BOOKSTORE;
USE BOOKSTORE;
drop table books;

create table category(
categId int primary key auto_increment,
categName varchar(40)
);

create table author(
authorId int primary key auto_increment,
aname varchar(30),
categId int,
foreign key (categId) references category(categId)
);

CREATE TABLE BOOKS(
bookId int AUTO_INCREMENT PRIMARY KEY,
name varchar(50),
price double,
authorId int,
categId int,
FOREIGN KEY(AUTHORID) REFERENCES AUTHOR(AUTHORID),
FOREIGN KEY(categId) REFERENCES category(CATEGID)
);

desc category;
desc author;
desc books;

INSERT INTO category (categName) VALUES
('Fiction'),
('Non-fiction'),
('Science Fiction'),
('Mystery'),
('Thriller'),
('Romance'),
('Fantasy'),
('Biography'),
('History'),
('Self-help');

select * from category;

