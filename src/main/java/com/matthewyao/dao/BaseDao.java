package com.matthewyao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by matthewyao on 2017/1/3.
 */
public class BaseDao {

    protected JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("dataSource")
    public void setDatasource(DataSource datasource){
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }
}
