package com.ly.mall.dao;


import java.util.List;
import java.util.Map;

/**
 *   user dao 接口     -------记住了，是接口不是类------------
 *    接口关键字  interface
 */
public interface UserDao {

    int save(User user);

    /**
     *
     * @param params 从数据库差多用户集合封装在List集合里
     * @return
     */
    List<User> findAll(Map<String,Object> params);

    int delete(User user);
}
