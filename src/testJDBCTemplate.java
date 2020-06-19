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

        List<Book实体类> books=bs.getAllBooks();

        for(Book实体类 book:books)
        {
            System.out.println(book.getName()+"---"+book.getPages());
        }






    }



}
