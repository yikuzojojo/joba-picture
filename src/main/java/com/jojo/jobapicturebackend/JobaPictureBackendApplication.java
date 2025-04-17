package com.jojo.jobapicturebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class JobaPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobaPictureBackendApplication.class, args);
    }

}
