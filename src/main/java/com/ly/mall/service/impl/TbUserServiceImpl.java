package com.ly.mall.service.impl;

import com.ly.mall.common.web.Result;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.mall.domain.entity.TbUser;
import com.ly.mall.dao.TbUserMapper;
import com.ly.mall.service.TbUserService;
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService{

    @Override
    public Result inser(TbUser tbUser) {

        // 判断对象是否为空
        if (Objects.isNull(tbUser)){
            return Result.fall("对象不能为空");
        }
        // 判断用户名是否为空

        //判断密码是否为空
        //判断用户是否被注册了

        return null;
    }
}
