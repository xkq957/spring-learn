package com.xkq.spring._08factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author: xkq
 * @date: 2023/2/23 21:34
 * @description:
 */
public class UserFactoryBean implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        return new Book();
    }

    @Override
    public Class<?> getObjectType() {
        return Book.class;
    }
}
