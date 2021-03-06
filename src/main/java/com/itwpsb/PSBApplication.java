package com.itwpsb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PSBApplication extends SpringBootServletInitializer {

    private static final Logger LOGGER = LogManager.getLogger(PSBApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PSBApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(PSBApplication.class);
    }
}
