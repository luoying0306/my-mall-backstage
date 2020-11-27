package com.ly.mall.common.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageResult <T>{
    private Integer total;//数据总数
    private String msg;//消息
    private List<T> data;//集合
}
