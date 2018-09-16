/**
 * 
 */
package com.demo.share.designpattern.strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by youngwa on 2018年9月5日
 *
 */
@Service
public class SaleService {
	Map<String, CalcFee> calcFees = new HashMap<>();
	
	@Autowired
	public SaleService(List<CalcFee> calcs){
		for (CalcFee calcFee : calcs) {
			calcFees.put(calcFee.getType(), calcFee);
		}
	}
	
	public void executeCalc(String type, String name) {
		calcFees.get(type).doCalcFee(name);
	}
}
