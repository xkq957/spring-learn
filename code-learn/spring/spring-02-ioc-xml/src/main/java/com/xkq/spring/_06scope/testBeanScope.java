package com.xkq.spring._06scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/23 21:11
 * @description:
 */
public class testBeanScope {

    @Test
    public void testBeanScope(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-06-scope.xml");
        Book bean = context.getBean(Book.class);
        System.out.println(bean);

        Book bean1 = context.getBean(Book.class);
        System.out.println(bean1);
    }
}
