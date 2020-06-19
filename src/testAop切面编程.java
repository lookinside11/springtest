import com.AOP切面.ISAY;
import com.AOP切面.女人类;
import com.AOP切面.男人类;
import com.注解方式创建bean.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testAop切面编程 {

    public static   void main(String[] args) throws Exception {

       new testAop切面编程().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/AOP切面/beans.xml");
        ISAY man=ac.getBean("男人类",男人类.class);
        ISAY womang=ac.getBean("女人类",女人类.class);
        man.说话();
        womang.说话();



    }
}
