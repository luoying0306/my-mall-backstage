package com.ly.mall.controller;

import com.ly.mall.common.web.Result;
import com.ly.mall.domain.entity.TbCommodity;
import com.ly.mall.service.TbCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private TbCommodityService tbCommodityService;

    /**
     * 添加商品数据
     * @param tbCommodity
     * @return
     */
    @PostMapping("/save")//地址
    public Result save(@RequestBody TbCommodity tbCommodity){

        return tbCommodityService.saveGoods(tbCommodity);
    }

    /**
     * 获取商品列表数据
     * @return
     */
    @GetMapping("/list")
    public Result list(){
        return Result.success(tbCommodityService.list());
    }
    /**
     * 查看商品详情
     * 查看商品详情时，通过Id查询，要在方法里面定义一个参数来接收，如果是多个就用对象接收，少的话用一个类接收，自己判断传过来的
     是什么类型的数据；
     */
    @GetMapping("/details")
    public Result details(@RequestParam Integer id){

        return tbCommodityService.goodsDetails(id);
    }

}
