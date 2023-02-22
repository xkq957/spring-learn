package com.xkq.spring._01bean;

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
public class TestHelloWorld {
    private Logger logger = LoggerFactory.getLogger(TestHelloWorld.class);

    @Test
    public void testHelloWorld(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id和类型获取
//        HelloWorld helloWorld = ac.getBean("helloWorld", HelloWorld.class);
        //根据类型获取
        //根据类型获取bean时，要求IOC容器中指定类型bean有且只能有
        HelloWorld helloWorld = ac.getBean(HelloWorld.class);
        helloWorld.sayHello();
        logger.info("打印日志");
    }
}
