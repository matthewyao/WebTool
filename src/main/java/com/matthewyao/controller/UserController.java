package com.matthewyao.controller;

import com.matthewyao.entity.User;
import com.matthewyao.service.UserSerivce;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView toLogin(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }

    //TODO:使用极验验证加强安全性
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView doLogin(User user){
        ModelAndView mv = new ModelAndView();
        boolean success = this.userSerivce.login(user);
        if (success){
            mv.setViewName("success");
            mv.addObject("username",user.getUsername());
        }else {
            mv.setViewName("login");
        }
        return mv;
    }
}
