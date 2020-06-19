

import com.ASPECTJAOP操作.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class aspectjAop切面 {

    public static   void main(String[] args) throws Exception {

       new aspectjAop切面().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/ASPECTJAOP操作/beans.xml");


    }
}
