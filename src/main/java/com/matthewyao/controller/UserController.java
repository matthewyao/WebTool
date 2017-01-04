package com.matthewyao.controller;

import com.matthewyao.entity.User;
import com.matthewyao.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by matthewyao on 2017/1/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserSerivce userSerivce;

    @RequestMapping("/register")
    public void register(User user){
        this.userSerivce.register(user);
    }
}
