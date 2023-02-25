package com.xkq.spring;

import com.xkq.spring.config.SpringConfig;
import com.xkq.spring.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/25 16:58
 * @description:
 */
public class TestAnnotationConfig {

    @Test
    public void testAnnotationConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController bean = context.getBean(UserController.class);
        bean.saveUser();
    }
}
