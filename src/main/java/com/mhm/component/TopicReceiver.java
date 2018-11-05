package com.mhm.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 手动提交的方式
 * Created by MaHuiming on 2018/11/2.
 */
@Slf4j
@Component
public class TopicReceiver {

//    @KafkaListener(topics = "spring_boot_test", containerFactory = "kafkaListenerContainerFactory")
//    public void receive(String record, Acknowledgment ack) {
//        ack.acknowledge();
//        log.info("facebase----------------------:{}",record);
//    }
}
