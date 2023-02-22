package com.xkq.spring._01bean;

/**
 * @author: xkq
 * @date: 2023/2/22 22:50
 * @description:
 */
public class StudentDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("学生类执行");
    }
}
