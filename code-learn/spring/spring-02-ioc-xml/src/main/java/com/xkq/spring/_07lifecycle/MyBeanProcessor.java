package com.xkq.spring._07lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author: xkq
 * @date: 2023/2/23 21:27
 * @description:
 */
public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3. bean的后置处理器（初始化之前）");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5. bean的后置处理器（初始化之后）");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
