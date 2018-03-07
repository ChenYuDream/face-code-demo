package com.chenyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 * @date 2018年3月6日17:53:42
 * @author chenyu
 */
@Controller
public class PageController {



    @RequestMapping("/")
    public String toIndex(){

        return "index";
    }

}
