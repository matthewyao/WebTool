package com.matthewyao.dao;

import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by matthewyao on 2017/1/3.
 */
@Repository("userDao")
public class UserDao extends BaseDao {

    public Map<String,String> queryAllUser(){
        SqlRowSet rs = this.jdbcTemplate.queryForRowSet("SELECT * FROM web_user");
        Map<String,String> userMap = new HashMap<String,String>();
        while (rs.next()){
            userMap.put(rs.getString("user_name"),rs.getString("user_password"));
        }
        return userMap;

    }
}
