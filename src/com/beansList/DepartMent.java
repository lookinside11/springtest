package com.beansList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DepartMent {

    private List<String> ems;

    public List<String> getEms() {
        return ems;
    }

    public void setEms(List<String> ems) {
        this.ems = ems;
    }

    private Map<String, String> offices;

    public Map<String, String> getOffices() {
        return offices;
    }

    public void setOffices(Map<String, String> offices) {
        this.offices = offices;
    }

    private Set<String> fulis;

    public Set<String> getFulis() {
        return fulis;
    }

    public void setFulis(Set<String> fulis) {
        this.fulis = fulis;
    }

    private List<DepartTool> tools;

    public List<DepartTool> getTools() {
        return tools;
    }

    public void setTools(List<DepartTool> tools) {
        this.tools = tools;
    }
}

