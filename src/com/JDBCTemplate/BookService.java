package com.JDBCTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "bookservice")
public class BookService {

    @Autowired
    private BookDao bd;

    public void addBook(Book实体类 book)
    {
        bd.addBook(book);
    }
    public void updateBook(Book实体类 book)
    {
        bd.updateBook(book);
    }
    public int 得到数据量()
    {
        return bd.数据量();
    }
    public Book实体类 getBook(Book实体类 book)
    {
        return bd.getBook(book);
    }

    public List<Book实体类> getAllBooks()
    {
        return  bd.getAllBooks();
    }

}
