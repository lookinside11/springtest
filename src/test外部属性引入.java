import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.beans.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test外部属性引入 {

    public static   void main(String[] args) throws Exception {

       new test外部属性引入().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/外部属性引入/beans(inject).xml");
        DruidDataSource dc= (DruidDataSource) ac.getBean("datasource");
        DruidPooledConnection conn=dc.getConnection();
        conn.createStatement().execute("create TABLE  test (name varchar(200))");

    }
}
