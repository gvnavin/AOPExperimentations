package com.gvnavin.aop.perfmetrics.acrossPackage1;

import java.util.List;

/**
 * Created by gnavin on 5/8/16.
 */
public class PerfAcrossPackage1A {
    public void method1(final String str, final int no) throws InterruptedException {
        Thread.currentThread().sleep(15);
    }

    public void method2(final List<String> list) throws InterruptedException {
        Thread.currentThread().sleep(25);
    }
}
