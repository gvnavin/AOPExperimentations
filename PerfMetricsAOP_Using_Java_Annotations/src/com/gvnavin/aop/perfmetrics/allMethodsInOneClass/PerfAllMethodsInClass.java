package com.gvnavin.aop.perfmetrics.allMethodsInOneClass;

/**
 * Created by gnavin on 5/8/16.
 */
public class PerfAllMethodsInClass {
    public void method1() throws InterruptedException {
        Thread.currentThread().sleep(20);
    }

    public void method2() throws InterruptedException {
        Thread.currentThread().sleep(25);
    }

    public void method3() throws InterruptedException {
        Thread.currentThread().sleep(30);
    }

    public void method4() throws InterruptedException {
        Thread.currentThread().sleep(35);
    }

    public void method5() throws InterruptedException {
        Thread.currentThread().sleep(40);
    }
}
