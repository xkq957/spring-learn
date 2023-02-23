package com.xkq.spring._09autowire.controller;

import com.xkq.spring._09autowire.service.UserService;

/**
 * @author: xkq
 * @date: 2023/2/23 21:39
 * @description:
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        System.out.println("userController 保存");
        userService.saveUser();
    }
}
