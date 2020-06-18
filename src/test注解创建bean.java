import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.注解方式创建bean.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test注解创建bean {

    public static   void main(String[] args) throws Exception {

       new test注解创建bean().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/注解方式创建bean/beans.xml");
        Person p1= (Person) ac.getBean("person");
        p1.getHair().说话();




    }
}
