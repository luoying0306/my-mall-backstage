package com.ly.mall.config.handle;

import com.alibaba.fastjson.JSON;
import com.ly.mall.common.utils.ServletUtils;
import com.ly.mall.common.web.Result;
import com.ly.mall.config.security.LoginUser;
import com.ly.mall.config.security.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * 自定义退出处理
 * @author 13557
 */
@Component
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler {

    @Autowired
    private TokenService tokenService;
    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        LoginUser loginUser = tokenService.getLoginUser(httpServletRequest);
        if (Objects.nonNull(loginUser))
        {
            String userName = loginUser.getUsername();
            // 删除用户缓存记录
            tokenService.delLoginUser(loginUser.getToken());
        }
        ServletUtils.renderString(httpServletResponse, JSON.toJSONString(Result.success("退出成功")));
    }
}
