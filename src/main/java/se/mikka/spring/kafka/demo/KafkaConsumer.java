package se.mikka.spring.kafka.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class KafkaConsumer {

    private static Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "mikka", groupId = "group_id")
    public void consume(String message) throws IOException {
        LOG.info(String.format("#### -> Consumed message -> %s", message));
    }
}
