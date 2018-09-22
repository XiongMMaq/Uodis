package com.zuche.uodis.exceptions;

/**
 * @author: XiongMM
 * @date: 2018/9/18 20:14
 * @description:
 */
public class UodisException extends RuntimeException {

    public UodisException(String message) {
        super(message);
    }

    public UodisException(Throwable e) {
        super(e);
    }

    public UodisException(String message, Throwable cause) {
        super(message, cause);
    }
}
