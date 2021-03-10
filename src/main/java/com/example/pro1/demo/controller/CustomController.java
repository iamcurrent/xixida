package com.example.pro1.demo.controller;

import com.example.pro1.demo.entity.UserInfo;
import com.example.pro1.demo.sqlcontrol.MySqlController;
import org.apache.catalina.manager.DummyProxySession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
@Controller
public class CustomController {

    @Autowired
    RedisTemplate<String,Object> redisTemplate;


    @Autowired
    MySqlController mySqlController;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginFit(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) throws SQLException {
        List<String> list = new ArrayList<>();
        list.add(username);
        list.add(password);
        redisTemplate.opsForValue().set("info",list,60, TimeUnit.SECONDS);
        UserInfo user = new UserInfo();
        user.setUsername(username);
        user.setPassword(password);
        mySqlController.add(user);

        session.setAttribute("info",list);

        return "redirect:/main.html";
    }
}
