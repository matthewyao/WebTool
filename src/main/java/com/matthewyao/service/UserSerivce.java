package com.matthewyao.service;

import com.matthewyao.dao.UserDao;
import com.matthewyao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by matthewyao on 2017/1/4.
 */
@Service
public class UserSerivce {

    @Autowired
    private UserDao userDao;

    public void register(User user){
        this.userDao.addUser(user);
    }
}
