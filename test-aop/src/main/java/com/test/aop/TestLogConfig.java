package com.test.aop;

import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xinjian on 16/11/26.
 */
@Configuration
public class TestLogConfig {
    @Bean
    public TestLogAspect dataSourceSelectAspect() {
        TestLogAspect aspect = Aspects.aspectOf(TestLogAspect.class);
        return aspect;
    }
}
