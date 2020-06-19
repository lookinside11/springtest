import com.AOP切面JDK方式代理.ISAY;
import com.AOP切面JDK方式代理.女人类;
import com.AOP切面JDK方式代理.男人类;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class testAop切面编程 {

    public static   void main(String[] args) throws Exception {

       new testAop切面编程().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/AOP切面JDK方式代理/beans.xml");
        男人类 man=ac.getBean("男人类",男人类.class);
        女人类 womang=ac.getBean("女人类",女人类.class);


        Class[] interfaces={ISAY.class};
        男人类 man1=new 男人类();
        ISAY newSay= (ISAY) Proxy.newProxyInstance(testAop切面编程.class.getClassLoader(),interfaces,new 加强功能类(womang));
        newSay.说话();
        newSay.吃饭();
    }
}

class 加强功能类  implements InvocationHandler{
    private  ISAY obj;

    //这里目的是要把被代理的对象弄过来，以便于注入新的功能
    public 加强功能类(ISAY obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //增强的逻辑，method就是被拦截的方法名，args就是方法的参数，最后返回一个object
        System.out.println("方法是---"+method.getName());
        Object res=method.invoke(obj,args);//这句话是调用原来的函数功能并返回值
        //这里就可以加你注入的逻辑代码了，相当于拦截了原来的函数比如可以做检测什么的。
        return res;
    }
}
