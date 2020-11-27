package com.ly.mall.service;

import com.ly.mall.common.web.Result;
import com.ly.mall.domain.entity.TbCommodity;
import com.baomidou.mybatisplus.extension.service.IService;
public interface TbCommodityService extends IService<TbCommodity>{


    Result saveGoods(TbCommodity tbCommodity);

    Result goodsDetails(Integer id);
}
