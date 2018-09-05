/**
 * 
 */
package com.demo.share.designpattern.strategy;

import org.springframework.stereotype.Service;

/**
 * Created by youngwa on 2018年9月5日
 *
 */
@Service
public class VipCalcFee implements CalcFee{
	
	@Override
	public String getType() {
		return "vip";
	}

	@Override
	public void doCalcFee(String name) {
		System.out.println("姓名 "+ name + " 执行vip收费");
	}

}
