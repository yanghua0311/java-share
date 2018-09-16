package com.demo.share.algorithms;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 根据已知插入后的顺序和插入的内容，求出插入的影响的最长连续块
 * 例如原来(1,3,5)插入2之后变为(1,2,3,5)此时2的插入会影响3并需要依赖1.得到1，2，3
 * 当插入2，4时，则影响3，5，依赖1，则直接返回1，2，3，4，5
 * 背景：估值表导入的持仓计算，后一天的计算会依赖前一天的计算
 * Created by youngwa on 2018/09/16. 11:56
 */
public class SolveMaxBlock {
    public static void main(String[] args) {
        ArrayList<Integer> inserts = Lists.newArrayList(2, 4,7);
        ArrayList<Integer> all = Lists.newArrayList(1, 2, 3, 4, 5,6,7,8,9);
        int minKeyIndex = 0;
        Map<Integer, List<Integer>> blockMap = new HashMap<>();
        int blockIndex = 0;
        int lastNum = -9999999;
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i) == inserts.get(minKeyIndex)) {
                if (blockMap.get(blockIndex - 1) != null && lastNum == blockMap.get(blockIndex - 1).get(blockMap.get(blockIndex - 1).size() - 1)) {
                    blockIndex = blockIndex - 1;
                }
                List<Integer> integers = blockMap.get(blockIndex);
                if (integers == null) {
                    integers = new ArrayList<>();
                    if (i != 0) {
                        integers.add(lastNum);
                    }
                    blockMap.put(blockIndex, integers);
                }
                integers.add(all.get(i));
                minKeyIndex++;
                if (minKeyIndex > inserts.size()-1) {
                    minKeyIndex = inserts.size()-1;
                }
            } else {
                List<Integer> integers = blockMap.get(blockIndex);
                if (integers != null) {
                    integers.add(all.get(i));
                }
                blockIndex ++;
                lastNum = all.get(i);
            }
        }
        System.out.println(blockMap);
    }
}
