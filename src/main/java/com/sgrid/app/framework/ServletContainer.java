package com.sgrid.app.framework;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

public class ServletContainer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>{

    @Autowired
    private SgridConf sgridConf;

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        int port = 8080;
        String host = null;
        if(sgridConf.server.port != null){
            port = sgridConf.server.port;
        }
        factory.setPort(port);

        if(sgridConf.server.host != null){
            host = sgridConf.server.host;
        }
        try {
            factory.setAddress(InetAddress.getByName(host));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("[Sgrid-Java] [info] sgridConf [%s]",sgridConf));
        System.out.println("[Sgrid-Java] [info] End Init Sgrid servletContainer ");
    }
    
}
