import com.beans.Person;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public class testRun {

    public  void main1() throws Exception {

    }

    @Test
    public void show() throws Exception {
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("com/beans/beans.xml");
        Person p1= ac.getBean("person",Person.class);
        p1.destroy();
        ac.close();
    }
}
