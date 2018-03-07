package com.chenyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 *
 * @author chenyu
 * @date 2018年3月6日17:53:42
 */
@Controller
public class PageController {


    /**
     * 跳转到首页
     *
     * @return
     */
    @RequestMapping("/")
    public String toIndex() {

        return "index";
    }

    /**
     * 跳转到用户表单页面
     * @return
     */
    @RequestMapping("user/form")
    public String toUserForm() {

        return "user_form";
    }
}
