package com.chenyu.config.mybatis;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * mybatisplus自定义填充公共字段 ,即没有传的字段自动填充
 * @author chenyuyuyu
 */
@Component
public class MyMetaObjectHandler extends MetaObjectHandler {
    /**
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {

        Object updateTime = metaObject.getValue("updateTime");
        Object createTime = metaObject.getValue("createTime");
        System.out.println(updateTime);
        System.out.println(createTime);


    }

    /**
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        insertFill(metaObject);
    }
}