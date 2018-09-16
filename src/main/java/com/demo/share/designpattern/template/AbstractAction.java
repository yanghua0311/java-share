/**
 * 
 */
package com.demo.share.designpattern.template;

/**
 * Created by youngwa on 2018年9月5日
 *
 */
public abstract class AbstractAction {
	public abstract void Before();
	public abstract void after();
	public abstract void doing();
	
	public void excute() {
		Before();
		doing();
		after();
	}
}
