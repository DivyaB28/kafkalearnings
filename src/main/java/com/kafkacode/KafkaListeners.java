package com.kafkacode;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "devcode",
            groupId = "newGroupId"
    )
    void listener(String data) {
        System.out.println("Listener received data :-))" + data + " :))");
    }
}
