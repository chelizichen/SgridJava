package spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import spring.app.framework.SgridConf;

@SpringBootApplication
public class App {

    @Autowired
    private SgridConf config;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        return new TomcatServletWebServerFactory(config.server.port);
    }

    public void run(String... args) throws Exception {
        System.out.println("Server: " + config);
        System.out.println("Server: " + config.server.port);
    }
}
