package com.gvnavin.aop.perfmetrics;

import com.gvnavin.aop.perfmetrics.acrossPackage1.PerfAcrossPackage1A;
import com.gvnavin.aop.perfmetrics.acrossPackage1.PerfAcrossPackage1B;
import com.gvnavin.aop.perfmetrics.acrossPackage2.PerfAcrossPackage2A;
import com.gvnavin.aop.perfmetrics.acrossPackage2.PerfAcrossPackage2B;
import com.gvnavin.aop.perfmetrics.allMethodsInOneClass.PerfAllMethodsInClass;
import com.gvnavin.aop.perfmetrics.onlyOneMethod.PerfParticularMethodInClass;

import java.util.Collections;

/**
 * Created by gnavin on 5/8/16.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting in Main");
        final PerfAcrossPackage1A perfAcrossPackage1A = new PerfAcrossPackage1A();
        perfAcrossPackage1A.method1("hello", 100);
        perfAcrossPackage1A.method2(Collections.emptyList());

        final PerfAcrossPackage1B perfAcrossPackage1B = new PerfAcrossPackage1B();
        perfAcrossPackage1B.method1(new int[]{1,2,3});
        perfAcrossPackage1B.method2(26.73);

        final PerfAcrossPackage2A perfAcrossPackage2A = new PerfAcrossPackage2A();
        perfAcrossPackage2A.method1();
        perfAcrossPackage2A.method2();

        final PerfAcrossPackage2B perfAcrossPackage2B = new PerfAcrossPackage2B();
        perfAcrossPackage2B.method1();
        perfAcrossPackage2B.method2();

        final PerfAllMethodsInClass perfAllMethodsInClass = new PerfAllMethodsInClass();
        perfAllMethodsInClass.method1();
        perfAllMethodsInClass.method2();
        perfAllMethodsInClass.method3();
        perfAllMethodsInClass.method4();
        perfAllMethodsInClass.method5();

        final PerfParticularMethodInClass perfParticularMethodInClass = new PerfParticularMethodInClass();
        perfParticularMethodInClass.method1();
    }
}
