package com.demo.share.ssm.service;

import com.demo.share.ssm.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ..
 *
 * @author 杨华
 * @version 1.0
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018-09-14 16:12
 * @since JDK1.7
 */
@Service
public class AllService {
    @Autowired
    AppService appService;

    @Autowired
    BookService bookService;


    @Transactional
    public void insert(Book book) {
        try {
            bookService.insert(book);
            appService.insert();
        } catch (Exception e) {

        }
    }
}
