package com.jerax.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/12 19:26
 */
@RestController
public class TestController {


    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery ,port:" + port + string;
    }
}
