/**
 * 
 */
package com.demo.share.designpattern.strategy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.share.InitSpringContext;

/**
 * Created by youngwa on 2018/9/05.
 *
 */
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = InitSpringContext.init();
		SaleService saleService = (SaleService) classPathXmlApplicationContext.getBean("saleService");
		saleService.executeCalc("vip", "youngwa");
		saleService.executeCalc("common", "bin");

	}
}
