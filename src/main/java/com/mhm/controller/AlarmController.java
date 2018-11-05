package com.mhm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by MHm on 2018/8/7.
 */
@RestController
public class    AlarmController {

    private final static Logger logger = LoggerFactory.getLogger(AlarmController.class);
    @Value("${tcp.switch}")
    private String tswitch;

    @RequestMapping(value = "/alarmSwitch")
    public String isSwitch(){
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return tswitch;
    }
}
