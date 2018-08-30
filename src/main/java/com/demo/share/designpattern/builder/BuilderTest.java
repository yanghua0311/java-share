package com.demo.share.designpattern.builder;

/**
 *
 * Created by youngwa on 2018/8/29.
 */
public class BuilderTest {
    public static void main(String[] args) {
        SqlSessionConfig sqlSessionConfig = SqlSessionConfig.builder()
                                                            .setUrl("192.168.0.1")
                                                            .setPort(3306)
                                                            .setName("root")
                                                            .setPwd("root")
                                                            .create();
        System.out.println(sqlSessionConfig);
    }
}
