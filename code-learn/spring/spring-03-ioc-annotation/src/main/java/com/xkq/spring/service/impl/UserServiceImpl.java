package com.xkq.spring.service.impl;

import com.xkq.spring.dao.UserDao;
import com.xkq.spring.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: xkq
 * @date: 2023/2/23 21:42
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void saveUser() {
        System.out.println("userService 保存");
        userDao.saveUser();
    }
}
