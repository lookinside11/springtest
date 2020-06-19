import com.AOP切面JDK方式代理.ISAY;
import com.AOP切面JDK方式代理.女人类;
import com.AOP切面JDK方式代理.男人类;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class aspectjAop切面 {

    public static   void main(String[] args) throws Exception {

       new testAop切面编程().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/AOP切面JDK方式代理/beans.xml");
        男人类 man=ac.getBean("男人类",男人类.class);
        女人类 womang=ac.getBean("女人类",女人类.class);



    }
}
