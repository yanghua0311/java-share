/**
 * 
 */
package com.demo.share.designpattern.template;

/**
 * Created by youngwa on 2018年9月5日
 *
 */
public class OneAction extends AbstractAction{

	@Override
	public void Before() {
		System.out.println("====================我开始了");
	}

	@Override
	public void after() {
		System.out.println("====================我结束了");

	}

	@Override
	public void doing() {
		System.out.println("====================ing...");

	}

}
