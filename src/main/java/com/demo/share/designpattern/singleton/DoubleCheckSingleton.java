package com.demo.share.designpattern.singleton;

/**
 * 
 * 双重检查===单例模式（懒汉式），优点：线程安全，延迟加载，效率较高
 * 
 * @version 1.0
 * @since JDK1.7
 * @author 商理亮
 * @company 上海朝阳永续信息技术股份有限公司
 * @copyright (c) 2018 SunTime Co'Ltd Inc. All rights reserved.
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
