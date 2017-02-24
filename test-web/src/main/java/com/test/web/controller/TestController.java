package com.test.web.controller;

import com.test.aop.TestLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xinjian on 17/2/24.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @TestLog
    public String helloWorld() {
        return "Hello World";
    }
}
