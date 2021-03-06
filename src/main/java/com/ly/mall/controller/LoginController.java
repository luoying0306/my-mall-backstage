package com.ly.mall.controller;

import com.ly.mall.common.web.Result;
import com.ly.mall.config.security.LoginBody;
import com.ly.mall.config.security.service.LoginService;
import com.ly.mall.config.security.service.TokenService;
import com.ly.mall.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

public class LoginController {
    @Autowired
    private TokenService tokenService;
    @Autowired
    private LoginService loginService;


    /** 登录
     * @param loginBody username password
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody LoginBody loginBody)
    {
        System.out.println("登录信息："+loginBody);
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword());
        Map<String,String> result = new HashMap<>(1);
        result.put("token",token);
        return Result.success("登录成功！",200,result);
    }

}
