package com.xkq.spring._09autowire.dao.impl;

import com.xkq.spring._09autowire.dao.UserDao;

/**
 * @author: xkq
 * @date: 2023/2/23 21:41
 * @description:
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("userDao 保存");
    }
}
