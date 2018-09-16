package com.demo.share.concurrency.pool;

public interface ThreadPool<Job extends Runnable> {
    //执行一个job，这个job需要实现Runnable
    void exeute(Job job);
    //关闭线程池
    void shutDown();
    //增加工作者线程
    void addWorker(int num);
    //减少工作者线程
    void removeWorker(int num);
    //获取正在等待执行的任务数量
    int getJobSize();
}
