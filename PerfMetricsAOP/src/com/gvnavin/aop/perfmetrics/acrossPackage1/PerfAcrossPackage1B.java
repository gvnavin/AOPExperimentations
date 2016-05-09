package com.gvnavin.aop.perfmetrics.acrossPackage1;

/**
 * Created by gnavin on 5/8/16.
 */
public class PerfAcrossPackage1B {
    public void method1(final int[] arr) throws InterruptedException {
        Thread.currentThread().sleep(35);
    }

    public void method2(final Double money) throws InterruptedException {
        Thread.currentThread().sleep(45);
    }
}
