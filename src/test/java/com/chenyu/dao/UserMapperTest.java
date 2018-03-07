package com.chenyu.dao;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.chenyu.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;


    @Test
    public void testSelect(){

        List<User> users = userMapper.selectList(new EntityWrapper<>());
        for (User user : users) {
            log.info(user.toString());
        }

    }

}