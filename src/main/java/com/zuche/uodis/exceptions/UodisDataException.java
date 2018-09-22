package com.zuche.uodis.exceptions;

/**
 * @author: XiongMM
 * @date: 2018/9/18 20:14
 * @description:
 */
public class UodisDataException extends RuntimeException {

    public UodisDataException(String message) {
        super(message);
    }

    public UodisDataException(Throwable e) {
        super(e);
    }

    public UodisDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
