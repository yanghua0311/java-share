package com.demo.share.designpattern.singleton;

/**
 * 
 * 静态内部类===单例模式（类似饿汉式），优点：线程安全，延迟加载，效率高
 * 
 * @version 1.0
 * @since JDK1.7
 * @author 商理亮
 * @company 上海朝阳永续信息技术股份有限公司
 * @copyright (c) 2018 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018年8月21日下午1:54:58
 */
public class StaticInnerClassSingleton {

	private StaticInnerClassSingleton(){}

	private static class SingletonInstance {
		private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
	}
	
	public static StaticInnerClassSingleton getInstance() {
		return SingletonInstance.instance;
	}

}
