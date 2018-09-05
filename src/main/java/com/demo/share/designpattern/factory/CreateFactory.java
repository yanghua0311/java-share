package com.demo.share.designpattern.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * ..
 *
 * @author 杨华
 * @version 1.0
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018-08-21 15:50
 * @since JDK1.7
 */
@Component
public class CreateFactory {
    @Autowired
    @Qualifier("aService")
    private FooService aService;

    @Autowired
    @Qualifier("bService")
    private FooService bService;

    @Autowired
    @Qualifier("cService")
    private FooService cService;

    private static CreateFactory factory;

    @PostConstruct
    void init(){
        factory = this;
    }

    public static FooService getService(String type) {
        switch (type) {
            case "a" : return  factory.aService;
            case "b" : return  factory.bService;
            case "c" : return  factory.cService;
            default: return null;
        }
    }
}
