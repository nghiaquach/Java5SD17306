package com.fpoly.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ResourceConfig {
    @Bean("messageSource")
    public MessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource ms
        = new ReloadableResourceBundleMessageSource();
        ms.setBasenames("classpath:messages/staff"); 
        ms.setDefaultEncoding("utf-8");
        return ms;
    }
}