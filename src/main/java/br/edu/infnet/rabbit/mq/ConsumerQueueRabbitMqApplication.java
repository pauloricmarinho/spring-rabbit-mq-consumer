package br.edu.infnet.rabbit.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerQueueRabbitMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerQueueRabbitMqApplication.class, args);
	}

}
