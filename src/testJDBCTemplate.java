import com.JDBCTemplate.BookService;
import com.JDBCTemplate.Book实体类;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class testJDBCTemplate {

    public static   void main(String[] args) throws Exception {

        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/JDBCTemplate/beans.xml");
        BookService bs= (BookService) ac.getBean("bookservice");

//        Book实体类 b1=new Book实体类();
//        b1.setId(1);b1.setName("c++");b1.setPages("11页");
//        Book实体类 b2=new Book实体类();
//        b2.setId(2);b2.setName("delphi++");b2.setPages("22页");
//
//
//
//         bs.addBook(b1); bs.addBook(b2);
        List<Book实体类> books=bs.getAllBooks();

        for(Book实体类 book:books)
        {
            System.out.println(book.getName()+"---"+book.getPages());
        }






    }



}
