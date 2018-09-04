/**
 * 
 */
package com.demo.share.aop.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by youngwa on 2018年9月4日
 *
 */
public class CglibFactory {
	/**
	 * 获得增强之后的目标类，即添加了切入逻辑advice之后的目标类
	 * 
	 * @param proxy
	 * @return
	 */
	public static LearnService getInstance(CglibProxy proxy) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(LearnService.class);
		//回调方法的参数为代理类对象CglibProxy，最后增强目标类调用的是代理类对象CglibProxy中的intercept方法
		enhancer.setCallback(proxy);
		//此刻，base不是单纯的目标类，而是增强过的目标类
		LearnService learnService = (LearnService) enhancer.create();
		return learnService;
	}
}
