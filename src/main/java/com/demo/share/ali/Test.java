/**
 * 
 */
package com.demo.share.ali;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by youngwa on 2018Äê9ÔÂ3ÈÕ
 *
 */
public class Test {
	public static void main(String[] args) {
		
	}
	public static void count(List<User> userList){
		Map<Long, Long> countMap = new TreeMap<>((o1, o2) -> (int)(o1 - o2));
		long minCount = 0;
		long minKey = 0;
		for (int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			if (countMap.size() == 10) {
				
			} else {
				if (countMap.get(user.getUserId()) == null) {
					countMap.put(user.getUserId(), 0l);
				}
				Long count = countMap.get(user.getUserId()) + 1;
				countMap.put(user.getUserId(), count);
				if (minCount > count) {
					minCount = count;
					minKey = user.getUserId();
				}
			}
		}
	}
}
