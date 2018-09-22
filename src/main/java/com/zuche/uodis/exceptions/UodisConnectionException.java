package com.zuche.uodis.exceptions;

/**
 * @author: XiongMM
 * @date: 2018/9/18 20:12
 * @description:
 */
public class UodisConnectionException extends UodisException {
    public UodisConnectionException(String message) {
        super(message);
    }

    public UodisConnectionException(Throwable e) {
        super(e);
    }

    public UodisConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
