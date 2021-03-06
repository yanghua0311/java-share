package com.demo.share.ssm.service;

import com.demo.share.InitSpringContext;
import com.demo.share.ssm.dao.BookDao;
import com.demo.share.ssm.exception.AppointException;
import com.demo.share.ssm.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ..
 *
 * @author 杨华
 * @date 2018-09-12 09:44
 */

@Service
public class BookService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BookDao bookDao;

//    @Transactional
    public void insert(Book book) {
        bookDao.insertBook(book);
//        try {
//            int i = 10 / 0;
//        } catch (ArithmeticException e) {
//            throw new AppointException("为0");
//        }
    }

    public Integer update() {
        return bookDao.reduceNumber(2000l);
    }
}
