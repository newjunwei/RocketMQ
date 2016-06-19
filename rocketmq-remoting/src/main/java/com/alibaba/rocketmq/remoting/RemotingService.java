package com.alibaba.rocketmq.remoting;

//服务接口
public interface RemotingService {
    public void start();


    public void shutdown();

    //这个得学习一下
    public void registerRPCHook(RPCHook rpcHook);
}
