package com.xkq.spring._09autowire.service.impl;

import com.xkq.spring._09autowire.dao.UserDao;
import com.xkq.spring._09autowire.service.UserService;

/**
 * @author: xkq
 * @date: 2023/2/23 21:42
 * @description:
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        System.out.println("userService 保存");
        userDao.saveUser();
    }
}
