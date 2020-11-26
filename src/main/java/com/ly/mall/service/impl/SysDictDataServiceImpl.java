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
import com.ly.mall.domain.entity.SysDictData;
import com.ly.mall.dao.SysDictDataMapper;
import com.ly.mall.service.SysDictDataService;
@Service
public class SysDictDataServiceImpl extends ServiceImpl<SysDictDataMapper, SysDictData> implements SysDictDataService{

    /**
     *  dao 注入
     */
    @Autowired
    private SysDictDataMapper sysDictDataMapper;
    @Autowired
    private TokenService tokenService;

    @Override
    public Result saveDictData(SysDictData sysDictData) {
        //为 null 判断
        if (Objects.isNull(sysDictData)){
            return Result.fall("提交字典数据不嫩为空！");
        }
        //设置时间
        sysDictData.setCreateTime(new Timestamp(System.currentTimeMillis()));
        //设置创建人
        sysDictData.setCreateUser(tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getId());
        //保存到数据库
        int i = sysDictDataMapper.insert(sysDictData);
        if (i>0){
            return Result.success("保存字典数据成功！");
        }
        return Result.fall("保存字典数据失败！");
    }
}
