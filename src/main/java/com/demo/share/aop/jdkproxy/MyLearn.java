/**
 * 
 */
package com.demo.share.aop.jdkproxy;

/**
 * Created by youngwa on 2018年9月4日
 *
 */
public class MyLearn implements LearnService{

	@Override
	public void read() {
		System.out.println("=======================》开始阅读");
	}

	@Override
	public void takingNotes() {
		System.out.println("=======================》开始记录笔记");
	}

}
