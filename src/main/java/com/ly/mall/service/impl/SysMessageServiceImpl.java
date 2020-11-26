package com.ly.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.mall.dao.SysMessageMapper;
import com.ly.mall.domain.entity.SysMessage;
import com.ly.mall.service.SysMessageService;
@Service
public class SysMessageServiceImpl extends ServiceImpl<SysMessageMapper, SysMessage> implements SysMessageService{

}
