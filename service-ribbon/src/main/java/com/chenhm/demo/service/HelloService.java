package com.chenhm.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenhongmin
 * @date 2019-01-31 17:06
 * @since V1.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {

        return restTemplate.getForObject("http://SERVICE-HI/demo?name=" + name, String.class);
    }

}
