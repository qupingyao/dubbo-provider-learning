package com.yqp.rpc_consumer.test;

import com.yqp.api.StudentService;
import com.yqp.api.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class TestHttpInvoker {

    private static Logger logger = Logger.getLogger(TestHttpInvoker.class);

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = ac.getBean("userService", UserService.class);
//        StudentService studentService = ac.getBean("studentService", StudentService.class);
        logger.info(userService.say("abc"));
//        logger.info(studentService.count(1));
    }

}
