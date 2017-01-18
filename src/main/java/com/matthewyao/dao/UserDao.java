package com.matthewyao.dao;

import com.matthewyao.entity.User;
import com.sun.deploy.net.proxy.pac.PACFunctions;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
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

    public void addUser(User user){
        if (isUserExists(user)){
            return;
        }
        String sql = "INSERT INTO web_user(user_name,user_password) VALUES(:username,:password)";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("username",user.getUsername());
        params.addValue("password",user.getPassword());
        this.namedParameterJdbcTemplate.update(sql,params);
    }

    private boolean isUserExists(User user){
        String sql = "SELECT * FROM web_user WHERE user_name=:username";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("username",user.getUsername());
        SqlRowSet rs = this.namedParameterJdbcTemplate.queryForRowSet(sql,params);
        return rs.next();
    }

    public boolean login(User user){
        String sql = "SELECT * FROM web_user WHERE user_name=:username and user_password=:password";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("username",user.getUsername());
        params.addValue("password",user.getPassword());
        SqlRowSet rs = this.namedParameterJdbcTemplate.queryForRowSet(sql,params);
        return rs.next();
    }
}
