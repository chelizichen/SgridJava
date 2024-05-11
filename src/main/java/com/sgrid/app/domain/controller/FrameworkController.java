package com.sgrid.app.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgrid.app.domain.service.FrameworkService;

@RestController
@RequestMapping("framework")
public class FrameworkController {

    @Autowired
    private FrameworkService frameworkService;

    @GetMapping("hello")
    public String Hello() {
        return "Hello " + frameworkService.Greet();
    }
}
