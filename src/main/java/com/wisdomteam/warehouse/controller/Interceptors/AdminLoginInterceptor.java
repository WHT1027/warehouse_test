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
       //��redis�������л�ȡuserId����������֤
        if(request.getSession().getAttribute("userId") != null){
            System.out.println("Session�д���userId��ͨ����֤��ֱ�ӽ����̨��");
            return true;
        }
        //Session�в�����userId����ת����¼ҳ��
        String  url = "/login";
        response.sendRedirect(url);
        System.out.println("Session�в�����userId�������أ���ת����¼ҳ�档������");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
