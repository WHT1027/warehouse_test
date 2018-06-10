package com.wisdomteam.warehouse.controller.Interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AdminLoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //从redis服务器中获取userId，并进行验证
        if(request.getSession().getAttribute("userId") != null){
            System.out.println("Session中存在userId，通过验证！直接进入后台！");
            return true;
        }
        //Session中不存在userId，跳转到登录页面
        String  url = "/login";
        response.sendRedirect(url);
        System.out.println("Session中不存在userId，被拦截！跳转到登录页面。。。。");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
