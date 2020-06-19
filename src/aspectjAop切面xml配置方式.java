


import com.ASPECTJAOP操作通过XML配置方式.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class aspectjAop切面xml配置方式 {

    public static   void main(String[] args) throws Exception {

       new aspectjAop切面xml配置方式().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/ASPECTJAOP操作通过XML配置方式/beans.xml");
        Person per= (Person) ac.getBean("person");
        per.say();


    }
}
