package com.zuche.uodis;

import org.junit.Test;

import java.util.List;

/**
 * @author: XiongMM
 * @date: 2018/9/19 17:51
 * @description:
 */
public class TestPipeline {

    @Test
    public void testPipline(){
        Uodis uodis = new Uodis("127.0.0.1");
        Pipeline pipeline = uodis.pipelined();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pipeline.hset("server", "" + i, "" + i);
        }

        List<Object> results = pipeline.syncAndReturnAll();
        System.out.println(results.size());
        long end = System.currentTimeMillis();
        System.out.println("Pipelined SET: " + ((end - start)/1000.0) + " seconds");
    }
}
