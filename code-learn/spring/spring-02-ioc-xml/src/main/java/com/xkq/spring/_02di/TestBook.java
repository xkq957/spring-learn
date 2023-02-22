package com.xkq.spring._02di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/22 23:05
 * @description:
 */
public class TestBook {
    @Test
    public void testDIBySet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Book book = applicationContext.getBean("Book", Book.class);
        System.out.println(book.toString());

        Book book2 = applicationContext.getBean("Book02", Book.class);
        System.out.println(book2.toString());

        Book book3 = applicationContext.getBean("Book03", Book.class);
        System.out.println(book3.toString());
    }
}
