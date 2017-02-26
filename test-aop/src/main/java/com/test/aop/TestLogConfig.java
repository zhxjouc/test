package com.test.aop;

import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by xinjian on 16/11/26.
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages="com.test")
public class TestLogConfig {
    @Bean
    public TestLogAspect dataSourceSelectAspect() {
        TestLogAspect aspect = Aspects.aspectOf(TestLogAspect.class);
        return aspect;
    }
}
