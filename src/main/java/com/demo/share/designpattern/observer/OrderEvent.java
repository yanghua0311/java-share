/**
 * 
 */
package com.demo.share.designpattern.observer;

import org.springframework.context.ApplicationEvent;

/**
 * Created by youngwa on 2018年9月5日
 *
 */
public class OrderEvent extends ApplicationEvent{

	/**
	 * @param source
	 */
	public OrderEvent(String source) {
		super(source);
	}

}
