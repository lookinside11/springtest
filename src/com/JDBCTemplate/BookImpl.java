package com.JDBCTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookImpl implements BookDao{

    //先把数据库模板搞进来
    @Autowired
    private JdbcTemplate jt;
}
