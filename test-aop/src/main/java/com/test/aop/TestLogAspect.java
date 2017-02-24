package com.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;

/**
 * Created by xinjian on 16/11/26.
 */

@Aspect
@Configurable
public class TestLogAspect {
    private static final Logger logger = LoggerFactory.getLogger(TestLogAspect.class);

    @Autowired
    private ApplicationContext applicationContext;


    @Around("execution(@net.vickymedia.ops.record.TestLog * *(..)) && @annotation(enableOperationRecord)")
    public Object recordOperation(ProceedingJoinPoint proceedingJoinPoint, TestLog enableOperationRecord) throws Throwable {
        logger.debug("start to test");

        try {
            return proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        } finally {
            logger.info("AOP test finish");
        }
    }
}
