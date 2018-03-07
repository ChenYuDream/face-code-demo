package com.chenyu.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.chenyu.base.BaseMapper;
import com.chenyu.service.BaseService;

/**
 * 公共service实现
 *
 * @author yu_chen
 * @create 2017-12-01 17:21
 **/
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

}
