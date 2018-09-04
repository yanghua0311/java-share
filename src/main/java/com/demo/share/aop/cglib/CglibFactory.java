/**
 * 
 */
package com.demo.share.aop.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by youngwa on 2018��9��4��
 *
 */
public class CglibFactory {
	/**
	 * �����ǿ֮���Ŀ���࣬������������߼�advice֮���Ŀ����
	 * 
	 * @param proxy
	 * @return
	 */
	public static LearnService getInstance(CglibProxy proxy) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(LearnService.class);
		//�ص������Ĳ���Ϊ���������CglibProxy�������ǿĿ������õ��Ǵ��������CglibProxy�е�intercept����
		enhancer.setCallback(proxy);
		//�˿̣�base���ǵ�����Ŀ���࣬������ǿ����Ŀ����
		LearnService learnService = (LearnService) enhancer.create();
		return learnService;
	}
}
