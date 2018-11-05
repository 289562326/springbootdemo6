package com.mhm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by MHm on 2018/8/7.
 */
@Slf4j
@RestController
public class FaceController {

    @RequestMapping(value = "/face")
    public String isSwitch(){
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        return "";
    }
}
