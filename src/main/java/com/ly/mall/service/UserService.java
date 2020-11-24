package com.ly.mall.service;

import com.ly.mall.domain.entity.User;

import java.util.Map;

/**
 * service 接口
 * 在这里只声明方法，不要实现
 */
public interface UserService {

    /**
     * 新增用户
     *
     * @param user 形参
     * @return Object 返回结果 比如：用户注册提交完信息后系统要告诉他操作成功还是失败
     * 。这里我用 Object（所有类的父类来表示，在你开发时要自己定义）
     * 返回对象一般有三个属性 code(状态码)、msg(消息)、data(数据)
     */
    public Object save(User user);

    /**
     * 查找用户
     *
     * @param params map类型，可以传不确定字段来查找用户
     * @return 把查找到的用户集合放回给浏览器
     */
    public Object list(Map<String, Object> params);

    /**
     * 删除用户           （快捷键说明 alt + 回车） 快速导包   f2 定位报错
     *
     * @param user
     * @return
     */
    public Object delete(User user);


    /**
     *  定义好借口后就去实现它
     */
}


