package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Jay.Jiang on 1/19/17.
 */

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class TestWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestWebApplication.class, args);
	}
}
