package com.xkq.spring._08factory;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/23 21:36
 * @description:
 */
public class TestUserFactoryBean {

    @Test
    public void testUserFactorBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-08-factory.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
    }
}
