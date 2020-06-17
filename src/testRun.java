import com.beans.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



public class testRun {
    public static void main(String[] args) throws Exception {

        //ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/beans/beans.xml");
        //Person p1= (Person) ac.getBean("person");
        //System.out.println(p1);
        //p1.destroy();
        //ac.registerShutdownHook();

        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("com/beans/beans.xml");
        Person p1= ac.getBean("person",Person.class);
        p1.destroy();
        p1=null;

        ac.close();




    }
}
