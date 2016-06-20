package com.testapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by kelnerF on 20/06/2016.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/s").setViewName("index1");
        registry.addViewController("/login").setViewName("login");


    }
}
