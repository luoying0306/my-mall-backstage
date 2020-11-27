package com.ly.mall.controller;

import com.ly.mall.common.web.Result;
import com.ly.mall.domain.entity.TbUser;
import com.ly.mall.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private TbUserService tbUserService;
    /**
     * 添加用户数据
     */
    @PostMapping("/insert")
    public Result insert(@RequestBody TbUser tbUser){
        return tbUserService.inser(tbUser);

    }
}
