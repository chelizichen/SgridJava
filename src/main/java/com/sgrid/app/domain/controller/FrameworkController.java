package com.sgrid.app.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgrid.app.domain.service.FrameworkService;
import com.sgrid.app.framework.SgridConf;

@RestController
@RequestMapping("framework")
public class FrameworkController {
    @Autowired 
    private SgridConf sgridConf;

    @Autowired
    private FrameworkService frameworkService;

    @GetMapping("hello")
    public String Hello() {
        return String.format("Hello %s  Author %s " , frameworkService.Greet(),sgridConf.get("author"));
    }
}
