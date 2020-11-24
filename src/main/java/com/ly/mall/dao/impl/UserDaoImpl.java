package com.ly.mall.dao.impl;

import com.ly.mall.dao.UserDao;
import com.ly.mall.domain.entity.User;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 *  这里是模拟对数据库的操作 ，使用mybatis就不需要这么操作了
 */
@SuppressWarnings("all")
public class UserDaoImpl  implements UserDao {
    public static List<User> sys = new ArrayList<>();

    /**
     *  构造器，初始化数据
     */
    public UserDaoImpl (){
        init();
    }

    private void init(){
        for (int i = 0; i < 20; i++) {
            User u = new User();
            u.setId(i);
            u.setPassword("abcdef"+i);
            u.setUsername("小A"+i);
            System.out.println("------------------初始化数据----------------"+i);
            System.out.println(u);
            UserDaoImpl.sys.add(u);
        }
    }


    @Override
    public int save(User user) {
        System.out.println("---------------------操作数据库-----------------");
        //获取id
        int id = UserDaoImpl.sys.size();
        //设置id
        user.setId(id);
        //保存数据
        boolean is = UserDaoImpl.sys.add(user);
        //判断哪是否成功
        if (is){
            // is 为 true 则成功
            return 1;
        }
        //保存失败
        return -1;
    }

    /**
     *  那个好像是系统文件的吧。
     * @param params 从数据库差多用户集合封装在List集合里
     * @return
     */
    @Override
    public List<User> findAll(Map<String, Object> params) {
        //获取参数
        String id = (String)params.get("id");
        String username = (String)params.get("username");
        String password = (String)params.get("password");
        //非空判断
        System.out.println("------------------查数据-------------------");
        //存放满足条件的数据
        List<User> list = new ArrayList<>();
        // 便利数据库找到合适条件的数据
        UserDaoImpl.sys.forEach(val ->{
            System.out.println(val);
            // 时间关系我就写一种条件查找
            if (!StringUtils.isEmpty(username)){
               if (val.getUsername().contains(username)){
                   list.add(val);
               }
            }else {
                list.add(val);
            }
        });
       //查到数据则返回
        return list;
    }

    @Override
    public int delete(User user) {
        //根据id删除
        Iterator<User> it = UserDaoImpl.sys.iterator();
        while (it.hasNext()){
            if (it.next().getId() ==user.getId()){
                it.remove();
                return 1;
            }
        }
        return -1;
    }
}
