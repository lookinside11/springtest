package com.JDBCTemplate;

import java.util.List;

public interface BookDao {

    public void addBook(Book实体类 book);
    public void updateBook(Book实体类 book);
    public int 数据量();
    public Book实体类 getBook(Book实体类 book);
    public List<Book实体类> getAllBooks();
}
