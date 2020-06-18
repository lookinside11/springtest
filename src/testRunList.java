import com.beans.Person;
import com.beansList.DepartMent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class testRunList {

    public static   void main(String[] args) throws Exception {
        new testRunList().show();
    }


    public void show() throws Exception {
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com/beansList/beans.xml");
        DepartMent dp= (DepartMent) ac.getBean("department");

        List<String> test=dp.getEms();
        for(String s:test)
        {
            System.out.println(s);
        }

        Map<String,String> map=dp.getOffices();
        for(Map.Entry<String,String> en:map.entrySet())
        {
            System.out.println(en.getKey()+"   --   "+en.getValue());
        }

        Set<String> fulis=dp.getFulis();
        for(String fuli:fulis)
        {
            System.out.println(fuli);
        }
    }
}
