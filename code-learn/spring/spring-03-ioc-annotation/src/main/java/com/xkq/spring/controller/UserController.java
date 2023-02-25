package com.xkq.spring.controller;

import com.xkq.spring.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author: xkq
 * @date: 2023/2/23 21:39
 * @description:
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    public void saveUser() {
        System.out.println("userController 保存");
        userService.saveUser();
    }
}
