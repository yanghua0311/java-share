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
 * @date 2018-09-05 13:26
 */

@Component
public class MessageObserver implements SmartApplicationListener {
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
    	System.out.println("进入邮寄环节");
    }
    @Bean
    @Override
    public int getOrder() {
        return 1;
    }
}
