package com.sgrid.app.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.sgrid.app.framework.SgridConf;

@Configuration
public class StaticResource extends WebMvcConfigurerAdapter {

    @Autowired
    private SgridConf config;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String uploadPath = "file:" + config.config.get("uploadPath");
        String webPath = "file:" + config.config.get("staticPath");
        System.out.println("uploadPath" + uploadPath);
        System.out.println("webPath" + webPath);
        registry.addResourceHandler("/staticfiles/**")
                .addResourceLocations(uploadPath);
        registry.addResourceHandler("/web/**")
                .addResourceLocations(webPath);
        super.addResourceHandlers(registry);
    }
}