package com.com.factorybean;

import com.beansList.DepartTool;
import org.springframework.beans.factory.FactoryBean;

public class factoryBean implements FactoryBean<DepartTool> {
    @Override
    public DepartTool getObject() throws Exception {
        DepartTool dt=new DepartTool();
        dt.setToolName("推土机");
        return dt;
    }

    @Override
    public Class<DepartTool> getObjectType() {
        return DepartTool.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
