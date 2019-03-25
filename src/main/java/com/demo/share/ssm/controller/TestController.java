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
 * @date 2018-09-14 09:28
 */
public class TestController {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext init = InitSpringContext.init();
        BookService bookService = (BookService) init.getBean("bookService");

        System.out.println(bookService.update());


    }
}
