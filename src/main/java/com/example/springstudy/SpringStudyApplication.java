package com.example.springstudy;

import com.example.springstudy.Controller.HelloController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations =  {"classpath:/beans.xml"})
@SpringBootApplication
public class SpringStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStudyApplication.class, args);

        Logger logger = LoggerFactory.getLogger(HelloController.class);
        //调用 sl4j 的 info() 方法，而非调用 logback 的方法
        logger.info("Hello World");
    }

}
