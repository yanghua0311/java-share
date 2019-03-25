package com.demo.share.ssm.custommybatis;

import com.demo.share.InitSpringContext;
import com.demo.share.ssm.model.Book;
import com.demo.share.ssm.service.AllService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by youngwa on 2018/12/23. 22:53
 */
public class TestUpdate {
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
