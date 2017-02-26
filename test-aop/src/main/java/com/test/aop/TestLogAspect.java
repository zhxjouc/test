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


    @Around("execution(@com.test.aop.TestLog * *(..)) && @annotation(testLog)")
    public Object recordOperation(ProceedingJoinPoint proceedingJoinPoint, TestLog testLog) throws Throwable {

        TestLogDB testLogDB = new TestLogDB();
        testLogDB.setId(1L);
        testLogDB.setName("abc");
        logger.info("start to test " + testLogDB.getName());
        try {
            return proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        } finally {
            logger.info("AOP test finish " + testLogDB);
        }
    }
}
