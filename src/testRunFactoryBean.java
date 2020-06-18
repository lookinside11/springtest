import com.beansList.DepartMent;
import com.beansList.DepartTool;
import com.com.factorybean.factoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.Configuration;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class testRunFactoryBean {

    public static   void main(String[] args) throws Exception {
        new testRunFactoryBean().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/com/factorybean/beans.xml");
        DepartTool fb= (DepartTool) ac.getBean("factorybean");
        System.out.println(fb.getToolName());
    }
}
