import com.beans.Hair;
import com.beans.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testRun {

    public static   void main(String[] args) throws Exception {
        new testRun().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/beans/beans(inject).xml");
        Person p1= ac.getBean("person",Person.class);

        System.out.println(p1);
        ac.registerShutdownHook();


    }
}
