package com.wisdomteam.warehouse.config;

import com.wisdomteam.warehouse.controller.Interceptors.AdminLoginCheckInterceptor;
import com.wisdomteam.warehouse.controller.Interceptors.AdminLoginInterceptor;
import com.wisdomteam.warehouse.controller.Interceptors.AdminLoginOutInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

    //静态资源处理器，控制静态资源的访问路径
   //@Override
   // public void addResourceHandlers(ResourceHandlerRegistry registry) {
      //  registry.addResourceHandler("/static/**/").addResourceLocations("classpath:/static/**/");
   // }

   //配置视图控制器，控制页面跳转。
   @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("warehouse");
        registry.addViewController("/login").setViewName("index");
        registry.addViewController("/warehouse").setViewName("warehouse");
        registry.addViewController("/linechart1").setViewName("linechart1");
        registry.addViewController("/warehouse_location").setViewName("warehouse_location");
        registry.addViewController("/foodsmanagement").setViewName("foodsmanagement");
        registry.addViewController("/house1").setViewName("house1");
        registry.addViewController("/house2").setViewName("house2");
        registry.addViewController("/getoutstorage1").setViewName("getoutstorage1");
        registry.addViewController("/getoutstorage2").setViewName("getoutstorage2");
        registry.addViewController("/putinstorage1").setViewName("putinstorage1");
        registry.addViewController("/putinstorage2").setViewName("putinstorage2");
       registry.addViewController("/Login").setViewName("warehouse");
    }

    //配置拦截器，拦截http请求
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //拦截首次进入系统请求，跳转到登录页面
        registry.addInterceptor(new AdminLoginInterceptor()).addPathPatterns("/");

        registry.addInterceptor(new AdminLoginCheckInterceptor()).addPathPatterns("/Admin/logincheck");

        registry.addInterceptor(new AdminLoginInterceptor()).addPathPatterns("/warehouse");

        registry.addInterceptor(new AdminLoginOutInterceptor()).addPathPatterns("/Admin/loginout");
    }


    //启动默认的配置类
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
