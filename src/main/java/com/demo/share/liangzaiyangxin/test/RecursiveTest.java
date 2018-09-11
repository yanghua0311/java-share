package com.demo.share.liangzaiyangxin.test;

/**
 * �ݹ�...
 *
 * @author ������
 * @version 1.0
 * @company �Ϻ�����������Ϣ�����ɷ����޹�˾
 * @copyright (c) 2018 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018/9/7 16:22
 * @since JDK1.7
 */
public class RecursiveTest {

    public static void main(String[] args) {

        System.out.println(climbStairs(6));

    }

    /**
     * @Description: һ����һ��������¥�ݡ����ж���������
     *
     * @auther: ������
     * @date: 16:24 2018/9/7
     * @param n ¥����
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
