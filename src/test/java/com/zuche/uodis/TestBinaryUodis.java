package com.zuche.uodis;

import org.junit.Test;

import java.io.UnsupportedEncodingException;


/**
 * @author: XiongMM
 * @date: 2018/9/19 17:51
 * @description:
 */
public class TestBinaryUodis {


    @Test
    public void testBinarySet() throws UnsupportedEncodingException {
        Uodis uodis = new Uodis("127.0.0.1");
        uodis.set("testbinary".getBytes("UTF-8"),"testbinary".getBytes("UTF-8"));
        System.out.println(new String(uodis.get("testbinary".getBytes("UTF-8"))));
    }
}
