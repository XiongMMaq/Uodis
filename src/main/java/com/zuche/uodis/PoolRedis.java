package com.zuche.uodis;

/**
 * @author: XiongMM
 * @date: 2018/9/22 16:14
 * @description:
 */
public abstract class PoolRedis implements UodisCommands{

    protected long lastUsedTime ;

    public abstract void setUsedTime();

    public long getLoasUsedTime(){
        return lastUsedTime;
    }

    public abstract void close();
}
