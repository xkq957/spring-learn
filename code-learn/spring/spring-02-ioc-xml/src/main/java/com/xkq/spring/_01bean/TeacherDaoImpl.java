package com.xkq.spring._01bean;

/**
 * @author: xkq
 * @date: 2023/2/22 22:51
 * @description:
 */
public class TeacherDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("老师类执行");
    }
}
