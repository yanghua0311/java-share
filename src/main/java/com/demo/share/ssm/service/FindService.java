package com.demo.share.ssm.service;

import com.demo.share.InitSpringContext;
import com.demo.share.ssm.dao.BookDao;
import com.demo.share.ssm.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ..
 *
 * @author 杨华
 * @version 1.0
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018-09-12 09:44
 * @since JDK1.7
 */
public class FindService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext init = InitSpringContext.init();
        BookDao bookDao = (BookDao) init.getBean("bookDao");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)init.getBean("sqlSessionFactory1");
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        sqlSession.select("", Book);
        Book book = bookDao.queryById(1000L);
        System.out.println(book);

    }
}
