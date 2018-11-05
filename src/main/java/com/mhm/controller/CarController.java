package com.mhm.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MHm on 2018/8/7.
 */
@Log4j2
@RestController
public class CarController {
    @RequestMapping(value = "/car")
    public String isSwitch(){
        log.trace("log4j2 trace");
        log.debug("log4j2 debug");
        log.info("log4j2 info");
        log.warn("log4j2 warn");
        log.error("log4j2 error");
        return "";
    }
}
