package com.gvnavin.aop.perfmetrics.aspect;

import java.util.Arrays;

/**
 * Created by gnavin on 5/8/16.
 */
public aspect PerfAspectAJ {

    Object around() : execution(* com.gvnavin.aop.perfmetrics.acrossPackage*.*.*.(..)) {
        final long startTime = System.currentTimeMillis();
        try {
            return proceed();
        } finally {
            final long endime = System.currentTimeMillis();
            String logStr = String.format("Time take to execute method-[%s.%s()] with arguments %s is %s milli seconds",
                    thisJoinPoint.getThis().getClass().getCanonicalName(), thisJoinPoint.getSignature().getName(),
                    Arrays.toString(thisJoinPoint.getArgs()), (endime-startTime));
            System.out.println(logStr);
        }
    }

    Object around() : execution(* com.gvnavin.aop.perfmetrics.allMethodsInOneClass.PerfAllMethodsInClass.*(..)) {
        final long startTime = System.currentTimeMillis();
        try {
            return proceed();
        } finally {
            final long endime = System.currentTimeMillis();
            String logStr = String.format("Time take to execute method-[%s.%s()] with arguments %s is %s milli seconds",
                    thisJoinPoint.getThis().getClass().getCanonicalName(), thisJoinPoint.getSignature().getName(),
                    Arrays.toString(thisJoinPoint.getArgs()), (endime-startTime));
            System.out.println(logStr);
        }
    }

    Object around() : execution(* com.gvnavin.aop.perfmetrics.onlyOneMethod.PerfParticularMethodInClass.method1(..)) {
        final long startTime = System.currentTimeMillis();
        try {
            return proceed();
        } finally {
            final long endime = System.currentTimeMillis();
            String logStr = String.format("Time take to execute method-[%s.%s()] with arguments %s is %s milli seconds",
                    thisJoinPoint.getThis().getClass().getCanonicalName(), thisJoinPoint.getSignature().getName(),
                    Arrays.toString(thisJoinPoint.getArgs()), (endime-startTime));
            System.out.println(logStr);
        }
    }

}
