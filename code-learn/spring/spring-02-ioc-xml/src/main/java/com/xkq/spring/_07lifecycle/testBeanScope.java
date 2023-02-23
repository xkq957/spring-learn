package com.xkq.spring._07lifecycle;

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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-07-lifecycle.xml");
        Book bean = context.getBean(Book.class);
        System.out.println("6. 对象使用");
        System.out.println(bean);
        context.close();
    }
}
