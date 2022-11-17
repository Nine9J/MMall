package com.mmall.config;

import com.mmall.interceptor.AdminInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AdminInterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){

        HandlerInterceptor interceptor = new AdminInterceptor();

        /** 黑名单List */
        List<String> patterns = new ArrayList<>();
        patterns.add("/web/AdminHeader.html");
        patterns.add("/web/AdminHeader.js");
        patterns.add("/web/Management.html");
        patterns.add("/web/OrderManagement.html");
        patterns.add("/web/Update.html");
        patterns.add("/products/add");
        patterns.add("/products/update");
        patterns.add("/products/delete");
        patterns.add("/products/uploadImage");
        patterns.add("/order/confirmDis");
        patterns.add("/order/selectAll");


        registry.addInterceptor(interceptor).
                addPathPatterns(patterns);
    }
}
