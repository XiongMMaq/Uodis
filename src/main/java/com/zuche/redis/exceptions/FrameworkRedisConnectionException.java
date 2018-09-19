package com.zuche.redis.exceptions;

/**
 * @author: XiongMM
 * @date: 2018/9/18 20:12
 * @description:
 */
public class FrameworkRedisConnectionException extends FrameworkRedisException{
    public FrameworkRedisConnectionException(String message) {
        super(message);
    }

    public FrameworkRedisConnectionException(Throwable e) {
        super(e);
    }

    public FrameworkRedisConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
