package com.sgrid.app.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.sgrid.app.framework.SgridConf;

@SuppressWarnings("deprecation")
@Configuration
public class StaticResource extends WebMvcConfigurerAdapter {

    @Autowired
    private SgridConf sgridConf;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String uploadPath = "file:" + sgridConf.get("uploadPath");
        String webPath = "file:" + sgridConf.get("staticPath");
        System.out.println("uploadPath" + uploadPath);
        System.out.println("webPath" + webPath);
        registry.addResourceHandler("/staticfiles/**")
                .addResourceLocations(uploadPath);
        registry.addResourceHandler("/web/**")
                .addResourceLocations(webPath);
        super.addResourceHandlers(registry);
    }
}