package com.ly.mall.controller;

import com.ly.mall.common.web.Result;
import com.ly.mall.domain.entity.SysDictData;
import com.ly.mall.service.SysDictDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  1. 打注解
 *
 *  @RestController
 * @RequestMapping("/dict-data")
 */
@RestController
@RequestMapping("/dict-data")
public class DictDataController {
    /**
     * 注入 SysDictDataService
     */
    @Autowired
    private SysDictDataService sysDictDataService;

    /**
     *  添加字典数据
     * @param sysDictData
     * @return
     */
    @PostMapping("/save")
    public Result save(@RequestBody SysDictData sysDictData){

        return sysDictDataService.saveDictData(sysDictData);
    }
    @GetMapping("/select")
    public  Result select(){
        return Result.success(sysDictDataService.list());
    }


}
