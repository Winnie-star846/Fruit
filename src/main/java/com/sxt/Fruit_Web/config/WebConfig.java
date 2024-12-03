package com.sxt.Fruit_Web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 将 /pictures/ 映射到 D:/IDEA/pictures/ 目录
        registry.addResourceHandler("/images/**")
                .addResourceLocations("file:/Web/images/");
    }
}
