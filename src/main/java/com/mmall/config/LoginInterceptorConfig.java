package com.mmall.config;

import com.mmall.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/** 完成登录拦截器的注册 */
@Configuration
public class LoginInterceptorConfig implements WebMvcConfigurer {

    /** 配置拦截器 */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /** 用户拦截 */
        /**创建自定义的拦截器*/
        HandlerInterceptor interceptor = new LoginInterceptor();

        /** 白名单List */
        List<String> patterns = new ArrayList<>();
        patterns.add("/css/**");
        patterns.add("/web/Login.html");
        patterns.add("/web/Home.html");
        patterns.add("/web/View.html");
        patterns.add("/web/Header.js");
        patterns.add("/users/reg");
        patterns.add("/users/login");
        patterns.add("/users/checkName");
        patterns.add("/users/adminLogin");
        patterns.add("/image/**");
        patterns.add("/products/selectAll");
        patterns.add("/upload/**");

        registry.addInterceptor(interceptor).
                addPathPatterns("/**").
                excludePathPatterns(patterns);
    }
}
