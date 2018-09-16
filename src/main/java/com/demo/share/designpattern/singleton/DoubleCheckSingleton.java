package com.demo.share.designpattern.singleton;

/**
 * 
 * 双重检查===单例模式（懒汉式），优点：线程安全，延迟加载，效率较高
 * 
 * @author 杨华
 * @date 2018年8月21日下午1:54:58
 */
public class DoubleCheckSingleton {

	private DoubleCheckSingleton(){}
	
	private static volatile DoubleCheckSingleton instance;
	
	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized(DoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
