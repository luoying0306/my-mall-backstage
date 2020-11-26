package com.ly.mall.service;

import com.ly.mall.common.web.Result;
import com.ly.mall.domain.entity.SysDictType;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysDictTypeService extends IService<SysDictType>{


    Result saveDictType(SysDictType sysDictType);
}
