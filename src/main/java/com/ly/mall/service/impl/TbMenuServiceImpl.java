package com.ly.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.mall.dao.TbMenuMapper;
import com.ly.mall.domain.entity.TbMenu;
import com.ly.mall.service.TbMenuService;
@Service
public class TbMenuServiceImpl extends ServiceImpl<TbMenuMapper, TbMenu> implements TbMenuService{

}
