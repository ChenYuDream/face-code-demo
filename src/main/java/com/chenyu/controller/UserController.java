package com.chenyu.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.chenyu.entity.User;
import com.chenyu.result.Result;
import com.chenyu.result.ResultUtil;
import com.chenyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chenyuyuyu
 * @Date 2018年3月7日20:05:57
 */
@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 查询所有用户信息
     *
     * @return
     */
    @GetMapping("query/all")
    public Result selectAllUser() {
        List<User> users = userService.selectList(new EntityWrapper<>());
        return ResultUtil.success(users);
    }


    /**
     * 保存或者更新用户数据
     * @return
     */
    @PostMapping("save")
    public Result saveOrUpdateUser() {

        return ResultUtil.success();
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    @PostMapping("delete/{id}")
    public Result deleteUser(@PathVariable("id") String id) {

        return ResultUtil.success();
    }

}
