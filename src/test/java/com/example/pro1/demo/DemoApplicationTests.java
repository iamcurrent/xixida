package com.example.pro1.demo;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.example.pro1.demo.entity.UserInfo;
import com.example.pro1.demo.sqlcontrol.MySqlController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.List;
import java.util.Properties;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    DataSource dataSource;

    @Test
    public void dataTest() throws SQLException, ClassNotFoundException {

        /*Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai","root","123456");
        Statement statement = connection.createStatement();
        ResultSet res = statement.executeQuery("select * from user ");
        while (res.next()){
            System.out.println(res.getString(1));
        }*/
    }

}
