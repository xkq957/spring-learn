package com.xkq.spring._04di_map;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/23 19:32
 * @description:
 */
public class TestStu {

    @Test
    public void testStudent(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-04-di-map.xml");
        Student studentA = context.getBean("studentA", Student.class);
        System.out.println(studentA);
        Student studentB = context.getBean("studentB", Student.class);
        System.out.println(studentB);
    }
}
