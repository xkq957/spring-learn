package com.xkq.spring._01bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xkq
 * @date: 2023/2/22 22:51
 * @description:
 */
public class TestUserDao {

    @Test
    public void testUserDao(){
        //根据类型获取接口对应bean
        //根据类型获取bean时，要求IOC容器中指定类型bean有且只能有
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml ");
        UserDao bean = ac.getBean(UserDao.class);
        bean.run();
    }
}
