import com.beans.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testRun {
    public static void main(String[] args) {

        ApplicationContext ac=new ClassPathXmlApplicationContext("com/beans/beans.xml");
        Person p1= (Person) ac.getBean("person");
        Person p2= (Person) ac.getBean("person");


        System.out.println("_----------__");
        p1.sayHi();
        p2.sayHi();





    }
}
