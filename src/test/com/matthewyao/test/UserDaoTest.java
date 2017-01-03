package com.matthewyao.test;

import com.matthewyao.dao.UserDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by matthewyao on 2017/1/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-jdbc.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @org.junit.Test
    public void queryAllUser() throws Exception {
        Map<String,String> userMap = userDao.queryAllUser();
        assertEquals(1,userMap.size());
    }
}