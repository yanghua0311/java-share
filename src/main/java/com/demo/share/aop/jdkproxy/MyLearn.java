/**
 * 
 */
package com.demo.share.aop.jdkproxy;

/**
 * Created by youngwa on 2018��9��4��
 *
 */
public class MyLearn implements LearnService{

	@Override
	public void read() {
		System.out.println("=======================����ʼ�Ķ�");
	}

	@Override
	public void takingNotes() {
		System.out.println("=======================����ʼ��¼�ʼ�");
	}

}
