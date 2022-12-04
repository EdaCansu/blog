package com.edacansu;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.util.TimeZone;

//Spring security Exclude
@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class
}
)
//@SpringBootApplication
public class BlogApplication {

    //Spring Constructor
    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
    }

    public static void main(String[] args) {
        //devtools active isActive
        //System.setProperty("spring.devtools.restart.enabled","true");

        //Disables headless
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(BlogApplication.class, args);
    }

}
