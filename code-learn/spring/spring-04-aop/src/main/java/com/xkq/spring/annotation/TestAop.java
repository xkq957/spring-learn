package com.xkq.spring.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/25 20:50
 * @description:
 */
public class TestAop {

    @Test
    public void testAop(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator bean = context.getBean(Calculator.class);
        bean.add(1, 1);
        bean.sub(1, 2);
//        bean.div(1, 0);
    }
}
