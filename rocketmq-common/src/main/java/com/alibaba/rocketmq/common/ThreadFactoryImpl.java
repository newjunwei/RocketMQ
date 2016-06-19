package com.alibaba.rocketmq.common;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// TODO: 6/7/16 自定义线程名称前缀及序号
public class ThreadFactoryImpl implements ThreadFactory {
    private final AtomicLong threadIndex = new AtomicLong(0);
    private final String threadNamePrefix;


    public ThreadFactoryImpl(final String threadNamePrefix) {
        this.threadNamePrefix = threadNamePrefix;
    }


    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r, threadNamePrefix + this.threadIndex.incrementAndGet());

    }
}
