package com.demo.share.designpattern.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * ..
 *
 * @author 杨华
 * @version 1.0
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018-09-05 13:26
 * @since JDK1.7
 */

@Component
public class WmsObserver implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
    	return eventType == OrderEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return true;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
    	System.out.println(event.getSource().toString());
        System.out.println("发送信息给用户");
    }
    @Bean
    @Override
    public int getOrder() {
        return 0;
    }
}
