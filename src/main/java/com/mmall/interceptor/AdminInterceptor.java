package com.mmall.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminInterceptor  implements HandlerInterceptor {
    /**
     * 检测session是否有 isAdmin 数据，且 isAdmin 是否为 1 ，是则放行，没有重定向到主页面
     * @param request
     * @param response
     * @param handler
     * @return 返回值为 true 表示放行,返回值为false则表示拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        Object obj = request.getSession().getAttribute("isAdmin");
        if(obj == null){
            response.sendRedirect("/web/Login.html");
            return false;
        }else if (Integer.parseInt(obj.toString()) != 1){
            response.sendRedirect("/web/Home.html");
            return false;
        }
        return true;
    }
}
