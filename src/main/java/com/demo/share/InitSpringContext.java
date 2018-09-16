package com.demo.share;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ..
 *
 * @author 杨华
 * @date 2018-09-05 11:05
 */
public class InitSpringContext {
    public static ClassPathXmlApplicationContext init() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        return classPathXmlApplicationContext;
    }
}
