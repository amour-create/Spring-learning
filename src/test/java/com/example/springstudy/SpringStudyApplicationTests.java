package com.example.springstudy;

import com.example.springstudy.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringStudyApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        boolean b = ioc.containsBean("personService");
        if (b) {
            System.out.println("personService 已添加到 IOC 容器中");
        } else {
            System.out.println("personService 没添加到 IOC 容器中");
        }
    }

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void logTest() {
        logger.trace("trace logger");
        logger.debug("debug logger");
        logger.info("info logger");
        logger.warn("warn logger");
        logger.error("error logger");
    }

    @Test
    void contextLoads() {
    }

}
