package com.demo.share;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ..
 *
 * @author 杨华
 * @version 1.0
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018-09-05 11:05
 * @since JDK1.7
 */
public class InitSpringContext {
    public static ClassPathXmlApplicationContext init() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        return classPathXmlApplicationContext;
    }
}
