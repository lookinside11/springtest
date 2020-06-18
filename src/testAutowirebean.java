import com.autowirebean.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testAutowirebean {

    public static   void main(String[] args) throws Exception {
        new testAutowirebean().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/autowirebean/beans(inject).xml");
        Person p1= ac.getBean("person1",Person.class);
        Person p2= ac.getBean("person2",Person.class);
        System.out.println(p1.getHair().getHairColor());
        System.out.println(p2.getHair().getHairColor());


    }
}
