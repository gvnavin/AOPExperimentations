package com.gvnavin.aop.perfmetrics.acrossPackage2;

/**
 * Created by gnavin on 5/8/16.
 */
public class PerfAcrossPackage2A {
    public void method1() throws InterruptedException {
        Thread.currentThread().sleep(30);
    }

    public void method2() throws InterruptedException {
        Thread.currentThread().sleep(60);
    }
}
