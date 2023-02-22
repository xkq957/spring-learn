package com.xkq.spring._03di;

import java.util.List;

/**
 * @author: xkq
 * @date: 2023/2/23 0:12
 * @description:
 */
public class Department {

    private String dName;

    private List<Employee> employees;

    public Department() {
    }

    public Department(String dName, List<Employee> employees) {
        this.dName = dName;
        this.employees = employees;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dName='" + dName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
