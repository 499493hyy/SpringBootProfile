package com.hxddd.learn.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HXD
 * 2020/4/29
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @Value(value = "${whichYML}")
    private String whichYML;

    @Value(value = "${defaultYML}")
    private String defaultYML;

    @RequestMapping("/yml")
    public String getWhichYML() {
        return "whichYML is :"+ whichYML + " ----and defaultYML is : " + defaultYML;
    }
}
