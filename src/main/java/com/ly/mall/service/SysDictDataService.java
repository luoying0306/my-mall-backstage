package com.ly.mall.service;

import com.ly.mall.common.web.Result;
import com.ly.mall.domain.entity.SysDictData;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysDictDataService extends IService<SysDictData>{


    Result saveDictData(SysDictData sysDictData);
}
