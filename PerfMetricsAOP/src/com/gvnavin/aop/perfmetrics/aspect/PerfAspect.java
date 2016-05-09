package com.gvnavin.aop.perfmetrics.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

/**
 * Created by gnavin on 5/8/16.
 */
@Aspect
public class PerfAspect {

    @Around("execution(* com.gvnavin.aop.perfmetrics.acrossPackage*.*.*(..))")
    public void measureTimeTakenAcrossPackage(final ProceedingJoinPoint joinPoint) throws Throwable {
        measureTimeTakenUtil(joinPoint);
    }

    @Around("execution(* com.gvnavin.aop.perfmetrics.allMethodsInOneClass.PerfAllMethodsInClass.*(..))")
    public void measureTimeTakenForAllTheMthodsInTheClass(final ProceedingJoinPoint joinPoint) throws Throwable {
        measureTimeTakenUtil(joinPoint);
    }

    @Around("execution(* com.gvnavin.aop.perfmetrics.onlyOneMethod.PerfParticularMethodInClass.method1(..))")
    public void measureTimeTakenForOnly(final ProceedingJoinPoint joinPoint) throws Throwable {
        measureTimeTakenUtil(joinPoint);
    }

    public void measureTimeTakenUtil(final ProceedingJoinPoint joinPoint) throws Throwable {
        //System.out.println("************ Aspect Start ****************");
        final long startTime = System.currentTimeMillis();
        //System.out.println("************ Method Start ****************");
        joinPoint.proceed();
        //System.out.println("************  Method end ****************");
        final long endime = System.currentTimeMillis();
        String logStr = String.format("Time take to execute method-[%s.%s()] with arguments %s is %s milli seconds",
                joinPoint.getThis().getClass().getCanonicalName(), joinPoint.getSignature().getName(),
                Arrays.toString(joinPoint.getArgs()), (endime-startTime));
        System.out.println(logStr);
        //System.out.println("************ Aspect End ****************");
    }
}
