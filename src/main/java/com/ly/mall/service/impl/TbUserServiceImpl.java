package com.ly.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.mall.domain.entity.TbUser;
import com.ly.mall.dao.TbUserMapper;
import com.ly.mall.service.TbUserService;
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService{

}
