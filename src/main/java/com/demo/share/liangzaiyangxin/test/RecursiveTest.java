package com.demo.share.liangzaiyangxin.test;

/**
 * @author ssl
 * @version 1.0
 * @date 2018/9/7 16:22
 */
public class RecursiveTest {

    public static void main(String[] args) {

        System.out.println(climbStairs(6));

    }

    /**
     * @Description: 一次爬一个或两个楼梯。共有多少种爬法
     * @date: 16:24 2018/9/7
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
