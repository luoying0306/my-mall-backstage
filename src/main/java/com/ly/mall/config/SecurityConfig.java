package com.ly.mall.config;


import com.ly.mall.config.security.filter.JwtAuthenticationTokenFilter;
import com.ly.mall.config.handle.AuthenticationEntryPointImpl;
import com.ly.mall.config.handle.LogoutSuccessHandlerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
@SuppressWarnings("all")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 自定义用户认证逻辑
     */
    @Autowired
    private UserDetailsService userDetailsService;

    /**
     * 认证失败处理类
     */
    @Autowired
    private AuthenticationEntryPointImpl authenticationEntryPoint;

    /**
     * 退出处理类
     */
    @Autowired
    private LogoutSuccessHandlerImpl logoutSuccessHandler;

    /**
     * token认证过滤器
     */
    @Autowired
    private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // CRSF禁用，因为不使用session
                .csrf().disable()
                // 认证失败处理类
                .exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and()
                // 基于token，所以不需要session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                // 过滤请求
                .authorizeRequests()
                // 对于登录login 验证码captchaImage 允许匿名访问
                .antMatchers("/login","/register", "/captchaImage").anonymous()
                .antMatchers(
                        HttpMethod.GET,
                        "/*.html",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js",
                        "/index/**"
                ).permitAll()
                .antMatchers("/profile/**").anonymous()
                .antMatchers("/druid/**").anonymous()
                // 除上面外的所有请求全部需要鉴权认证
                .anyRequest().authenticated()
                .and()
                .headers().frameOptions().disable();
        http.logout().logoutUrl("/logout").logoutSuccessHandler(logoutSuccessHandler);
        // 添加JWT filter
        http.addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }


    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
