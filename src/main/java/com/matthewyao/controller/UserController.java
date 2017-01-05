package com.matthewyao.controller;

import com.matthewyao.entity.User;
import com.matthewyao.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by matthewyao on 2017/1/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserSerivce userSerivce;

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public void register(User user){
        this.userSerivce.register(user);
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public void login(User user){
        boolean success = this.userSerivce.login(user);
    }
}
