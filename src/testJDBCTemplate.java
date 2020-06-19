import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.Statement;

public class testJDBCTemplate {

    public static   void main(String[] args) throws Exception {

        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/JDBCTemplate/beans.xml");
        JdbcTemplate jt= (JdbcTemplate) ac.getBean("jdbctemplate");
        System.out.println(jt);

    }



}
