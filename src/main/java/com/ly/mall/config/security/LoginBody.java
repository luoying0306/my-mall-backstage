package com.ly.mall.config.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 用户登录对象
 * 
 * @author ruoyi
 */
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginBody
{
    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 验证码
     */
    private String code;

    /**
     * 唯一标识
     */
    private String uuid = "";

}
