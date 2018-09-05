package com.demo.share.designpattern.observer;

/**
 * ..
 *
 * @author 杨华
 * @version 1.0
 * @company 上海朝阳永续信息技术有限公司
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2018-09-05 11:07
 * @since JDK1.7
 */
public class OrderService {

    public void save() {
        System.out.println("开始保存商品");

        System.out.println("进入邮寄环节");

        System.out.println("发送信息给用户");
    }
}
