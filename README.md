# spring-kafka-demo
A simple demo to experiment how to integrate Kafka with Spring

## Technologies
* Spring Boot 2
* Gradle
* Kafka
* Docker / Docker Compose

## How to run locally
* Start up Kafka: **$ docker-compose up -d**
* Build the project: **gradle build**
* Run Boot command to publish Topics to Kafka cluster:

**java -jar build/libs/mikka-spring-kafka-demo-0.0.1-SNAPSHOT.jar PRODUCE 3**

* Spring Boot application will automatically consume all messages in the topic and print out on the console

## Expected Output
After running the commands above, the expected output should be as below:

~~~~2019-08-15 17:00:15.489  INFO 10383 --- [ntainer#0-0-C-1] s.mikka.spring.kafka.demo.KafkaConsumer  : #### -> Consumed message -> MiKKa 0

2019-08-15 17:00:15.489  INFO 10383 --- [ntainer#0-0-C-1] s.mikka.spring.kafka.demo.KafkaConsumer  : #### -> Consumed message -> MiKKa 1

2019-08-15 17:00:15.489  INFO 10383 --- [ntainer#0-0-C-1] s.mikka.spring.kafka.demo.KafkaConsumer  : #### -> Consumed message -> MiKKa 2~~~~
