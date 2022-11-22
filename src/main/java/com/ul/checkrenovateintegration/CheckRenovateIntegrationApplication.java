package com.ul.checkrenovateintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CheckRenovateIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheckRenovateIntegrationApplication.class, args);
    }

    @GetMapping("/")
    public String status(){
        return "Site is up";
    }

}
