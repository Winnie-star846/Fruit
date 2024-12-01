package com.sxt.Fruit_Web.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;


@Configuration
public class CorsConfig {

    private static final long MAX_AGE = 24 * 60 * 60;


    @Bean

    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
// 配置访问原源地址
        corsConfiguration.addAllowedOrigin("http://8.138.163.62");
        corsConfiguration.addAllowedHeader("*");
// 设置请求方法
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.setMaxAge(MAX_AGE);
// 对接口配置跨域设置
        source.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsFilter();
    }

}