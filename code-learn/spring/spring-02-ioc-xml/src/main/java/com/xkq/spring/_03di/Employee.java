package com.xkq.spring._03di;

/**
 * @author: xkq
 * @date: 2023/2/23 0:13
 * @description:
 */
public class Employee {
    private String name;

    private String age;

    private String job;

    private Department department;

    public Employee() {
    }

    public Employee(String name, String age, String job, Department department) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", job='" + job + '\'' +
                ", department=" + department +
                '}';
    }
}
