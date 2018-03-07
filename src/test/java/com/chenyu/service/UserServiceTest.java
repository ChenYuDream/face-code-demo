package com.chenyu.service;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.chenyu.dao.UserMapper;
import com.chenyu.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@Rollback(value = false)
public class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    public void testSelect(){

        List<User> users = userService.selectList(new EntityWrapper<>());

        for (User user : users) {
            log.info(user.toString());
        }

    }

    @Test
    public void testInsert(){
        User user=new User();
        user.setUserName("chenyu");
        user.setOtherInfo("其他信息");
        user.setRoleType("0001");
        userService.insertOrUpdate(user);
    }

    @Test
    public void testUpdate(){
        User user=new User();
        user.setId("aa");
        user.setUserName("chenyuasdasdas");
        user.setOtherInfo("其他信息");
        user.setRoleType("0001");
        userService.updateAllColumnById(user);

    }
}