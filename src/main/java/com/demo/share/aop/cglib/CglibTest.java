/**
 * 
 */
package com.demo.share.aop.cglib;

import net.sf.cglib.proxy.Factory;

/**
 * Created by youngwa on 2018��9��4��
 *
 */
public class CglibTest {
	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		// baseΪ���ɵ���ǿ����Ŀ����
		LearnService service = CglibFactory.getInstance(proxy);
		service.read();
	}

}	
