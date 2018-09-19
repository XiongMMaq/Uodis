package com.zuche.redis.exceptions;

/**
 * @author: XiongMM
 * @date: 2018/9/18 20:14
 * @description:
 */
public class FrameworkRedisDataException extends RuntimeException {

    public FrameworkRedisDataException(String message) {
        super(message);
    }

    public FrameworkRedisDataException(Throwable e) {
        super(e);
    }

    public FrameworkRedisDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
