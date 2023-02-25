package com.xkq.spring;

import com.xkq.spring.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/25 16:54
 * @description:
 */
public class TestAnnotation {

    @Test
    public void testAnnotation(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserController bean = context.getBean(UserController.class);
        bean.saveUser();
    }
}
