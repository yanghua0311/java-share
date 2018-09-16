package com.demo.share.designpattern.singleton;

/**
 * 
 * 静态内部类===单例模式（类似饿汉式），优点：线程安全，延迟加载，效率高
 * 
 * @author 杨华
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
