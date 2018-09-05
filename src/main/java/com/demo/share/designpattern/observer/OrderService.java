package com.demo.share.designpattern.observer;

import java.applet.AppletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * ..
 *
 * @author 杨华
 * @version 1.0
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018-09-05 11:07
 * @since JDK1.7
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
