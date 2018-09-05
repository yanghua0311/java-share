/**
 * 
 */
package com.demo.share.designpattern.strategy;

/**
 * Created by youngwa on 2018年9月5日
 *
 */
public interface CalcFee {
	String getType();
	
	void doCalcFee(String name);
}
