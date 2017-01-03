package com.matthewyao.test;

import com.matthewyao.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by matthewyao on 2017/1/3.
 */
public class UserDaoTest {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @org.junit.Test
    public void queryAllUser() throws Exception {
        Map<String,String> userMap = userDao.queryAllUser();
        assertEquals(1,userMap.size());
    }
}