package com.xkq.spring.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/22 19:56
 * @description:
 */
public class HelloWorldTest {
    private Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);

    @Test
    public void testHelloWorld(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) ac.getBean("helloWorld");
        helloWorld.sayHello();
        logger.info("打印日志");
    }
}
