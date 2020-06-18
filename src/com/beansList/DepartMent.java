package com.beansList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DepartMent {

    private List<String> ems;

    public List<String> getEms() {
        return ems;
    }
    public void setEms(List<String> ems) {
        this.ems = ems;
    }

    private Map<String ,String> offices;

    public Map<String, String> getOffices() {
        return offices;
    }

    public void setOffices(Map<String, String> offices) {
        this.offices = offices;
    }
}
