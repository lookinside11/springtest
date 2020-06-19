

import com.ASPECTJAOP操作通过注解方式.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class aspectjAop切面通过注解方式 {

    public static   void main(String[] args) throws Exception {

       new aspectjAop切面通过注解方式().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new AnnotationConfigApplicationContext(com.ASPECTJAOP操作通过注解方式.ConfigClass.class);
        Person p= (Person) ac.getBean("person");
        p.say();
    }
}
