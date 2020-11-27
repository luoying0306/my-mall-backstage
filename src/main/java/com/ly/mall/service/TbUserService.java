package com.ly.mall.service;

import com.ly.mall.common.web.Result;
import com.ly.mall.domain.entity.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;
public interface TbUserService extends IService<TbUser>{


    Result inser(TbUser tbUser);
}
