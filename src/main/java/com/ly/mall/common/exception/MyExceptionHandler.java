package com.ly.mall.common.exception;

import com.ly.mall.common.web.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/** 全局异常处理
 * @author 13557
 */
@RestControllerAdvice
@Slf4j
public class MyExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public Result password(Exception e){
        return Result.fall(e.getMessage());
    }

    @ExceptionHandler(UsernameNotFoundException.class)
    public Result login(Exception e){
        log.info("用户不存在！");
        return Result.fall(e.getMessage());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public Result handleAuthorizationException(AccessDeniedException e){
        log.error(e.getMessage());
        return Result.fall("没有权限，请联系管理员授权",HttpStatus.FORBIDDEN.value(),null);
    }
}
