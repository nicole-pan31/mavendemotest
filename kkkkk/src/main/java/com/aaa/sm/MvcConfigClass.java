package com.aaa.sm;

import com.aaa.sm.interceptor.LoginInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * className:MvcConfigClass
 * discription:
 * author:panjing
 * createTime:2018-11-10 16:44
 */
@SpringBootConfiguration//标识该类为配置类
public class MvcConfigClass implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //添加自定义拦截器  配置拦截路径addPathPatterns和不拦截的路径excludePathPatterns 多个路径使用，隔开
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*/*").excludePathPatterns("/sb/emp/add","/sb/emp/picUpload","/login/checkLogin","/login/toLogin");
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
