package com.ly.mall.service.impl;

import com.ly.mall.common.utils.ServletUtils;
import com.ly.mall.common.web.Result;
import com.ly.mall.config.security.service.TokenService;
import jdk.nashorn.internal.parser.Token;
import jdk.nashorn.internal.parser.TokenStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.mall.domain.entity.SysDictType;
import com.ly.mall.dao.SysDictTypeMapper;
import com.ly.mall.service.SysDictTypeService;
@Service
public class SysDictTypeServiceImpl extends ServiceImpl<SysDictTypeMapper, SysDictType> implements SysDictTypeService{

    @Autowired
    private TokenService tokenStream;
    @Autowired
    private SysDictTypeMapper sysDictTypeMapper;

    @Override
    public Result saveDictType(SysDictType sysDictType) {
        if (Objects.isNull(sysDictType)){
            return Result.fall("提交字典类型数据不能为空！");
        }
        //设置时间
        sysDictType.setCreateTime(new Timestamp(System.currentTimeMillis()));
        //设置用户id
        sysDictType.setCreateUser(tokenStream.getLoginUser(ServletUtils.getRequest()).getUser().getId());
        //保存到数据库
        int i = sysDictTypeMapper.insert(sysDictType);
        if (i>0){
            return Result.success("保存字典类型成功！");
        }
        return Result.fall("保存字典类型失败！");
    }
}
