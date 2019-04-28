package com.chenhm.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenhongmin
 * @date 2019-01-31 16:46
 * @since V1.0
 */
@RestController
public class DemoController {

    @RequestMapping("demo")
    public String demo(){
        return "hello spring cloud";
    }
}

