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

select * from category;
select * from author;
select * from books;

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


INSERT INTO author (aname, categId) VALUES
('J.K. Rowling', 2),
('Stephen King', 4),
('Agatha Christie', 5),
('George Orwell', 3),
('Jane Austen', 2),
('Ernest Hemingway', 3),
('Harper Lee', 3),
('Leo Tolstoy', 2),
('Mark Twain', 4),
('J.R.R. Tolkien', 2);

-- Inserting sample data into the BOOKS table with real book names and bookIds
INSERT INTO BOOKS (bookId, name, price, authorId, categId) VALUES
(1, 'To Kill a Mockingbird', 12.99, 21, 1),
(2, '1984', 9.99, 22, 1),
(3, 'The Great Gatsby', 14.50, 23, 2),
(4, 'Pride and Prejudice', 11.25, 24, 2);