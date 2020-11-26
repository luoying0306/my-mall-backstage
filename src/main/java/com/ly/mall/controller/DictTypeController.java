package com.ly.mall.controller;

import com.ly.mall.common.web.Result;
import com.ly.mall.domain.entity.SysDictType;
import com.ly.mall.service.SysDictTypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dict-type")
public class DictTypeController {
    @Autowired
    private SysDictTypeService sysDictTypeService;

    /**
     *  添加字典类型
     * @param sysDictType
     * @return
     */
    @PostMapping("/save")
    public Result save(@RequestBody SysDictType sysDictType){
        return sysDictTypeService.saveDictType(sysDictType);
    }

    @GetMapping("/list")
    public Result list(){
        return Result.success(sysDictTypeService.list());
    }
}
