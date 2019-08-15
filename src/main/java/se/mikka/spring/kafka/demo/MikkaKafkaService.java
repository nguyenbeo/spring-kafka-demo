package se.mikka.spring.kafka.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MikkaKafkaService {

    public static final String TOPIC_NAME = "mikka";
    private static Logger LOG = LoggerFactory.getLogger(MikkaKafkaService.class);

    @Autowired
    private KafkaProducer producer;

    public void publish(int size) {
        LOG.info("Publishing {} topics to Kafka", size);

        List<String> mikkaTopics = new ArrayList<>();
        for (int i = 0 ; i < size; i++) {
            mikkaTopics.add("MiKKa " + i);
        }

        producer.sendMessages(mikkaTopics, TOPIC_NAME);
    }
}
