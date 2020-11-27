package com.ly.mall.service.impl;

import com.ly.mall.common.utils.ServletUtils;
import com.ly.mall.common.web.Result;
import com.ly.mall.config.security.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.mall.domain.entity.TbCommodity;
import com.ly.mall.dao.TbCommodityMapper;
import com.ly.mall.service.TbCommodityService;
@Service

public class TbCommodityServiceImpl extends ServiceImpl<TbCommodityMapper, TbCommodity> implements TbCommodityService{

    @Autowired
    private TbCommodityMapper tbCommodityMapper ;
    @Autowired
    private TokenService tokenService;
    @Override
    public Result saveGoods(TbCommodity tbCommodity) {
        if(Objects.isNull(tbCommodity)){
            return Result.fall("提交数据不能为空");
        }
        //设置时间
        tbCommodity.setDateTime(new Timestamp(System.currentTimeMillis()));
        //设置发布人ID.通过token拿到用户ID
        tbCommodity.setUserId(tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getId());
        int insert = tbCommodityMapper.insert(tbCommodity);
        if (insert>0){
            return Result.success("插入数据成功！");
        }
        return Result.fall("插入数据失败！");
    }

    @Override
    public Result goodsDetails(Integer id) {
        //判断id是否为空
        if (id==null){
            return Result.fall("id为空！");
        }
        TbCommodity tbCommodity = tbCommodityMapper.selectById(id);
        if (Objects.isNull(tbCommodity)){
            return  Result.fall("商品不存在！");
        }
        return Result.success(tbCommodity);
    }
}
