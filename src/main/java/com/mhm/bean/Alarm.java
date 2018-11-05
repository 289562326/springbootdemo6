package com.mhm.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * Created by MaHuiming on 2018/8/7.
 */
@Component
public class Alarm {
    @Value("${tcp.switch}")
    private String tswitch;

}
