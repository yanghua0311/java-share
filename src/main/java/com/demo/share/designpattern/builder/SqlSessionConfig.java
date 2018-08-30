package com.demo.share.designpattern.builder;

/**
 * 建造者模式示例
 * Created by youngwa on 2018/8/29.
 */
public class SqlSessionConfig {
    private String url;
    private int port;
    private String name;
    private String password;

    static class Builder {
        public SqlSessionConfig sessionConfig = new SqlSessionConfig();

        public Builder setUrl(String url){
            sessionConfig.url = url;
            return this;
        }

        public Builder setPort(int port){
            sessionConfig.port = port;
            return this;
        }

        public Builder setName(String name){
            sessionConfig.name = name;
            return this;
        }

        public Builder setPwd(String pwd){
            sessionConfig.password = pwd;
            return this;
        }

        public SqlSessionConfig create() {
            return sessionConfig;
        }
    }
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "SqlSessionConfig{" +
                "url='" + url + '\'' +
                ", port=" + port +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
