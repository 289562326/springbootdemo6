package com.mhm.task;

import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * Created by MHm on 2018/11/4.
 */
@Component
public class HeartBeatTask {

    @Scheduled(cron = "0/1 * * * * ? ")
    public void tesk() {
        System.out.println("开启定时任务" + new Date());

    }
}
