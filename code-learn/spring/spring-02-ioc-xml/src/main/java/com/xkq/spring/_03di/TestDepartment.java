package com.xkq.spring._03di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/23 0:25
 * @description:
 */
public class TestDepartment {
    @Test
    public void testDepartment(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-02-di.xml");
        Department department = ac.getBean("Department01", Department.class);
        System.out.println(department.toString());


        Department department02 = ac.getBean("Department02", Department.class);
        System.out.println(department02.toString());

        Employee employee = ac.getBean("Employee03", Employee.class);
        System.out.println(employee);
    }
}
