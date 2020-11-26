package com.ly.mall.config.security.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ly.mall.common.enums.UserStatus;
import com.ly.mall.common.exception.BaseException;
import com.ly.mall.config.security.LoginUser;
import com.ly.mall.domain.entity.TbUser;
import com.ly.mall.service.TbUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;
    @Autowired
    private SysPermissionService sysPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LambdaQueryWrapper<TbUser> lqw = new LambdaQueryWrapper<>();
        lqw.eq(TbUser::getName,username);
        TbUser user = tbUserService.getOne(lqw);
        System.out.println("用户："+user);
        if (Objects.isNull(user)){
            log.info("登录用户：{}不存在",username);
            throw new BaseException("登录用户："+username+"不存在!");
        }else if (new Integer(1).equals(user.getIsDelete())){
            log.info("登录用户：{}被删除",username);
            throw new BaseException("对不起，你的帐号："+username+"已删除");
        }else if (UserStatus.DISABLE.getCode().equals(user.getState())){
            log.info("登录用户：{} 已被停用.", username);
            throw new BaseException("对不起，您的账号：" + username + " 已停用");
        }
        return createLoginUser(user);
    }

    private UserDetails createLoginUser(TbUser user) {
        return new LoginUser(user, null);
    }
}
