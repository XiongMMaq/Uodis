package com.zuche.redis.exceptions;

/**
 * @author: XiongMM
 * @date: 2018/9/18 20:14
 * @description:
 */
public class FrameworkRedisException extends RuntimeException {

    public FrameworkRedisException(String message) {
        super(message);
    }

    public FrameworkRedisException(Throwable e) {
        super(e);
    }

    public FrameworkRedisException(String message, Throwable cause) {
        super(message, cause);
    }
}
