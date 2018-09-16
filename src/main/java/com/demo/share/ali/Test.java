/**
 * 
 */
package com.demo.share.ali;

import java.util.*;

/**
 * Created by youngwa on 2018/9/4.
 *
 */
public class Test {
	public static void main(String[] args) {
	    User user1 = new User(10L);
        User user2 = new User(101L);
        User user3 = new User(103L);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user3);
        userList.add(user2);
        Collections.sort(userList,((o1, o2) -> o2.getUserId().intValue() - o1.getUserId().intValue()));
        System.out.println(userList);

    }
	public static void count(List<User> userList){
        Map<Long, Long> countMap = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
        long minCount = 0;
        long minKey = 0;
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (countMap.size() == 10) {

            } else {
                if (countMap.get(user.getUserId()) == null) {
                    countMap.put(user.getUserId(), 0L);
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
    public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {return o2.getValue().compareTo(o1.getValue());});
        Map<K, V> result = new LinkedHashMap<K, V>();
        list.forEach(m -> {result.put(m.getKey(), m.getValue());});
        return result;
    }


}
