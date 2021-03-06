package com.vnext.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author leo
 * @version 1.0.0
 * @date 2018-07-27 06:34:51
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.vnext.mvc.controller" })
public class WebConfig extends WebMvcConfigurerAdapter {
    // public class WebConfig extends WebMvcConfigurerAdapter {
    // WebMvcConfigurationSupport

    // springboot 整合jsp 最好是war
    // 需要配置视图转换器
    // 创建SpringMVC视图解析器
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        // 可以在JSP页面中通过${}访问beans
        viewResolver.setExposeContextBeansAsAttributes(true);
        return viewResolver;
    }

}
