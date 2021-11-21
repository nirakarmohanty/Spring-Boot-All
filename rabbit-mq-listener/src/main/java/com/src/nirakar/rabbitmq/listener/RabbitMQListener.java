package com.src.nirakar.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {

	@RabbitListener(queues = "${rabbitmq.listener.queue}")
	public void recievedMessage1(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee.toString());
	}
	
	//@RabbitListener(queues = "${rabbitmq.listener.queue}")
	public void recievedMessage(String message) {
		System.out.println("Recieved Message From RabbitMQ: " + message);
	}
}
