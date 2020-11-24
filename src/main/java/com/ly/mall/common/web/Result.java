package com.ly.mall.common.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private String msg;
    private Integer code;
    private T data;

    
    public static <T> Result<T> success(String msg,Integer  code,T t){
        return new Result<T>(msg,code,t);
    }
    public static <T> Result<T> success(String msg){
        return success(msg,500,null);
    }
    public static <T> Result<T> success(T t){
        return new Result<T>("操作成功！",200,t);
    }
    public  static <T> Result<T> fall(String msg,Integer code,T t){
        return  new Result<T>(msg,code,t);
    }
    public  static <T> Result<T> fall(String msg){
        return fall(msg,500,null);
    }


}
