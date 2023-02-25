package com.xkq.spring.dao.impl;

import com.xkq.spring.dao.UserDao;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Repository;

/**
 * @author: xkq
 * @date: 2023/2/23 21:41
 * @description:
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("userDao 保存");
    }
}
