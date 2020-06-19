package com.JDBCTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookImpl implements BookDao{

    //先把数据库模板搞进来
    @Autowired
    private JdbcTemplate jt;


    @Override
    public void addBook(Book实体类 book) {
        int res=jt.update("insert into Books values (?,?,?)",book.getId(),book.getName(),book.getPages());
        System.out.println("成功更新数据量--"+res);

    }

    @Override
    public void updateBook(Book实体类 book) {
        int res=jt.update("update Books set name =?,pages=? where id=?",book.getName(),book.getPages(),book.getId());
        System.out.println("成功修改数据量--"+res);
    }

    @Override
    public int 数据量() {
        int i=jt.queryForObject("select count(1) from books",Integer.class);
        return i;
    }

    @Override
    public Book实体类 getBook(Book实体类 book) {
        return jt.queryForObject("select * from books where id=?",new BeanPropertyRowMapper<Book实体类>(Book实体类.class),book.getId());
    }

    @Override
    public List<Book实体类> getAllBooks() {
        List<Book实体类> books;
        books=jt.query("select * from books where id =?",new BeanPropertyRowMapper<Book实体类>(Book实体类.class),"1");
        return books;
    }


}
