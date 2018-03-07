package com.chenyu.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.chenyu.entity.User;
import com.chenyu.result.Result;
import com.chenyu.result.ResultUtil;
import com.chenyu.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
     * 分页查询用户信息
     *
     * @param page 分页对象
     * @return
     */
    @GetMapping("query/page")
    public Result selectOnePage(Page<User> page) {
        Page<User> page1 = userService.selectPage(page, new EntityWrapper<>());
        return ResultUtil.success(page1);
    }

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
     *
     * @return 保存或者更新失败返回-1 成功返回0
     */
    @PostMapping("save")
    public Result saveOrUpdateUser(User user) {
        if(StringUtils.isNotEmpty(user.getId())){
            user.setUpdateTime(new Date());
        }else {
            user.setUpdateTime(new Date());
            user.setCreateTime(new Date());
        }
        return userService.insertOrUpdateAllColumn(user) ? ResultUtil.success() : ResultUtil.fail();
    }

    /**
     * 删除用户信息
     *
     * @param id
     * @return 删除成功code==0
     */
    @PostMapping("delete/{id}")
    public Result deleteUser(@PathVariable("id") String id) {
        boolean b = userService.deleteById(id);
        return b ? ResultUtil.success() : ResultUtil.fail();
    }

}
