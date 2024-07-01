package com.sgrid.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sgrid.app.framework.EnableSgridServer;

@SpringBootApplication
@EnableSgridServer
public class SgridApplication {

    public static void main(String[] args) {
        SpringApplication.run(SgridApplication.class, args);
    }
}
