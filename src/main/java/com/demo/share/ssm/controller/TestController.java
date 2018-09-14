package com.demo.share.ssm.controller;

import com.demo.share.InitSpringContext;
import com.demo.share.ssm.model.Book;
import com.demo.share.ssm.service.AllService;
import com.demo.share.ssm.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ..
 *
 * @author 杨华
 * @version 1.0
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018-09-14 09:28
 * @since JDK1.7
 */
public class TestController {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext init = InitSpringContext.init();
        AllService allService = (AllService) init.getBean("allService");
        Book book = new Book();
        book.setBookId(2000L);
        book.setName("计算机组成原理");
        book.setNumber(20);
        allService.insert(book);
        System.out.println(book);

    }
}
