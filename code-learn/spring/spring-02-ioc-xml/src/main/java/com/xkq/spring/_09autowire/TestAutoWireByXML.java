package com.xkq.spring._09autowire;

import com.xkq.spring._09autowire.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/23 21:46
 * @description:
 */
public class TestAutoWireByXML {

    @Test
    public void testAutowireByXML(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-09-autowire.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.saveUser();
    }
}
