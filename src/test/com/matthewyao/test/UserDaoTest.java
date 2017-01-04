package com.matthewyao.test;

import com.matthewyao.dao.UserDao;
import com.matthewyao.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by matthewyao on 2017/1/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:WEB-INF/spring-jdbc.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void queryAllUser() throws Exception {
        Map<String, String> userMap = userDao.queryAllUser();
        assertTrue(userMap.size() > 0);
    }

    @Test
    public void addUser() {
        int beforeUsers = userDao.queryAllUser().size();
        User user = new User();
        user.setUsername("zq"+new Random().nextInt(100));
        user.setPassword("zzz");
        userDao.addUser(user);
        int afterUsers = userDao.queryAllUser().size();
        assertEquals(beforeUsers + 1, afterUsers);
    }
}