package com.demo.share.concurrency;


import java.sql.Connection;
import java.util.LinkedList;

/**
 * Created by youngwa on 2018/08/26. 21:50
 * 1.初始化线程池，放入到队列中去，
 * 2.在取用线程时先确定出当前时间和超时时间和线程池是否为空，再使用wait(mills)；超时返回
 * 3.用完之后放回池中，并唤醒所有等待的线程
 */
public class ConnectionPool {
    private LinkedList<Connection> pool = new LinkedList<>();

    public ConnectionPool (int initialSize) {
        if (initialSize  > 0){
            for (int i = 0; i < initialSize; i++) {
                pool.addLast(ConnectionDriver.createConnection());
            }
        }
    }
    //将连接放回线程池中
    public void releaseConnection(Connection connection) {
        if (connection != null) {
            synchronized (pool) {
                pool.addLast(connection);
                pool.notifyAll();
            }
        }
    }
    //在mills内无法获取到连接，将会返回null
    public Connection fetchConnection(long mills) throws InterruptedException {
        synchronized (pool) {
            if (mills <= 0) {
                while (pool.isEmpty()) {
                    pool.wait();
                }
                return pool.removeFirst();
            } else {
                long future = System.currentTimeMillis() + mills;
                long remaining = mills;
                while (pool.isEmpty() && remaining > 0) {
                    pool.wait(remaining);
                    remaining = future - System.currentTimeMillis();
                }
                Connection result = null;
                if (!pool.isEmpty()) {
                    result = pool.removeFirst();
                }
                return result;
            }
        }
    }
}
