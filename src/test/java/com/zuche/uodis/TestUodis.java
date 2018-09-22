package com.zuche.uodis;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: XiongMM
 * @date: 2018/9/19 17:50
 * @description:
 */
public class TestUodis {

    @Test
    public void testSet(){
        Uodis uodis = new Uodis("127.0.0.1");
        uodis.set("uodis-test","uodis-test");
        System.out.println("uodis-test");
    }

    @Test
    public void testHash(){
        Uodis uodis = new Uodis("127.0.0.1");
        System.out.println(uodis.exists("uodis-map1"));

        Map<String,String> map = new HashMap<String, String>();
        map.put("1","1");
        map.put("2","2");
        uodis.hset("uodis-map1",map);

        System.out.println(uodis.exists("uodis-map1"));

        System.out.println(uodis.hexists("uodis-map1","2"));

        System.out.println(uodis.hget("uodis-map1","2"));
    }
}
