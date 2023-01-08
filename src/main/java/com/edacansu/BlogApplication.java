package com.edacansu;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.TimeZone;


// Mongo aktif etmek icin
// @EnableMongoRepositories

// Aspect aktif etmek icin
// @EnableAspectJAutoProxy(proxyTargetClass = true)

// Asenkron açmak için
// @EnableAsync

// Spring Boot Cache mekanizmasınu aktif etmek için
// @EnableCaching

@EnableJpaAuditing(auditorAwareRef = "auditorAwareMethod")

//Spring security Exclude
@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class
}
)
@EnableJpaRepositories(basePackages = "com.edacansu.data.repository")

@EntityScan(basePackages = "com.edacansu.data.entity")

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
