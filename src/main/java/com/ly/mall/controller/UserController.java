package com.ly.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 *  @RestController 注解解释： 声明UserController类是一个controller
 *  @RequestMapping("/user") api 路径声明 “/user” 就是第一层api地址
 *   如： http://127.0.0.1:8080/user
 *  user 接口入口
 */

@RestController
@RequestMapping("/user")
public class UserController {

    /***
     *  在controller 注入service
     */

    @Autowired
    private UserService userService;


    /**
     *  用户列表 api http://127.0.0.1:8090/user/list
     * @param params 查找条件 id username password
     * @return 返回用户集合
     */
    @GetMapping("/list")
    public Object list(@RequestParam Map<String,Object> params){
        return userService.list(params);
    }


    /**
     *  添加用户 api http://127.0.0.1:8090/user/save
     * @param user 前端发送的用户信息
     * @return 返回操作情况
     */
    @PostMapping("/save")
    public Object save(@RequestBody User user){
        return userService.save(user);
    }

    /**
     *  删除一个用户 api http://127.0.0.1:8090/user/delete/{id}
     * @param id 用户id
     * @return 返回操作情况
     */
    @DeleteMapping("/delete/{id}")
    public Object delete(@PathVariable Integer id){
        User u = new User();
        return userService.delete(u);
    }
}
