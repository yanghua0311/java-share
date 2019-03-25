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
 * @date 2018-09-14 16:12
 */
@Service
public class AllService {
    @Autowired
    AppService appService;

    @Autowired
    BookService bookService;


    public void insert(Book book) {
            bookService.insert(book);
//            appService.insert();

    }


}
