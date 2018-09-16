package com.demo.share.designpattern.observer;

import java.applet.AppletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * ..
 *
 * @author 杨华
 * @date 2018-09-05 11:07
 */
@Service
public class OrderService {
	
	@Autowired
	ApplicationContext applicationContext;
	
    public void save() {
        System.out.println("开始保存商品");
        applicationContext.publishEvent(new OrderEvent("传递对象"));
        
    }
}
