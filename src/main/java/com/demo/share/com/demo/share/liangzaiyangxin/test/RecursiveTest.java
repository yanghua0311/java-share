package com.demo.share.com.demo.share.liangzaiyangxin.test;

/**
 * 递归...
 *
 * @author 商理亮
 * @version 1.0
 * @company 上海朝阳永续信息技术股份有限公司
 * @copyright (c) 2018 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018/9/7 16:22
 * @since JDK1.7
 */
public class RecursiveTest {

    public static void main(String[] args) {

        System.out.println(climbStairs(6));

    }

    /**
     * @Description: 一次爬一个或两个楼梯。共有多少种爬法
     *
     * @auther: 商理亮
     * @date: 16:24 2018/9/7
     * @param n 楼梯数
     * @return: int
     */
    public static int climbStairs(int n) {
        int i = 1;
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return i;
        }
        if (n == 2) {
            return i++;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
}
