package com.example.pro1.demo.sqlcontrol;

import com.example.pro1.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MySqlController {
    //查询
    public List<UserInfo> queryAll();
    //添加数据
    public int add(UserInfo userLogin);
    //根据用户名查询数据
    public UserInfo queryByName(String username);



}
