package se.mikka.spring.kafka.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MikkaSpringKafkaDemoApplication implements CommandLineRunner  {

	private static Logger LOG = LoggerFactory.getLogger(MikkaSpringKafkaDemoApplication.class);

	@Autowired
	private MikkaKafkaService kafkaService;

	public static void main(String[] args) {
		SpringApplication.run(MikkaSpringKafkaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("EXECUTING Kafka command ...");

		if (args.length != 2) {
			LOG.error("Wrong command syntax! Supposed to have 2 arguments");
			return;
		}

		String command = (args[0]).strip().toLowerCase(); //First arg is the Kafka command
		int size = Integer.valueOf(args[1]); //Second arg is the size of topics

		switch (command) {
			case "produce":
				kafkaService.publish(size);
				break;

			default:
				LOG.error("Wrong command");
		}
	}
}
