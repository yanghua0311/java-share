package com.demo.share.http;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.http.HttpStatus;

import java.io.IOException;

/**
 * Created by youngwa on 2019/04/10. 22:14
 */
public class HttpClientHtml {
    public static void main(String[] args) {
        System.out.println(getSource("http://www.aigaogao.com/tools/history.html?s=000001"));
    }
    public static String getSource(String url) {
        String html = new String();
        HttpGet httpget = new HttpGet(url);     //创建Http请求实例，URL 如：https://cd.lianjia.com/
        // 模拟浏览器，避免被服务器拒绝，返回返回403 forbidden的错误信息
        httpget.setHeader("User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.84 Safari/537.36");

        CloseableHttpResponse response = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();   // 使用默认的HttpClient
        try {
            response = httpclient.execute(httpget);
            if (response.getStatusLine().getStatusCode() == HttpStatus.OK.value()) {     // 返回 200 表示成功
                html = EntityUtils.toString(response.getEntity(), "utf-8");     // 获取服务器响应实体的内容
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return html;
    }
}
