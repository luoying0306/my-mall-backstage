package com.ly.mall.service.impl;

import com.ly.mall.dao.UserDao;
import com.ly.mall.dao.impl.UserDaoImpl;
import com.ly.mall.domain.entity.User;
import com.ly.mall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Service 注解  ------记得加注解----记得加注解--------记得加注解-------记得加注解----
 * UserService 接口实现类  alt + 回车 快速生成方法
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 在service册实现类里注入 dao
     * 这里是模拟所以我就直接new
     */
    private UserDao userDao = new UserDaoImpl();

    /**
     * @param user 形参
     * @return
     */
    @Override
    public Object save(User user) {
        System.out.println("-------添加数据---------");
        System.out.println(user);
        int i = userDao.save(user);
        if (i > 0) {
            return "添加成功！";
        }
        return "添加失败！";
    }

    @Override
    public Object list(Map<String, Object> params) {
        List<User> all = userDao.findAll(params);
        Map<String, Object> map = new HashMap<>();
        map.put("total", all.size());
        map.put("data", all);
        return map;
    }

    @Override
    public Object delete(User user) {
        int i = userDao.delete(user);
        if (i > 0) {
            return "删除成功！";
        }
        return "删除失败！";
    }

    /**
     *  你把userService 和实现类备份然后删除。在生成；
     *
     */
}


