package com.src.nirakar.rabbitmq.direct.multiple.queue;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.src.nirakar.rabbitmq.onequeue.CustomMessage;

@RestController
public class DirectExchangeMessagePublisher {

	@Autowired
	private RabbitTemplate template;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("exchangeName") String exchange, @RequestParam("routingKey") String routingKey,
			@RequestParam("messageData") String messageData) {

		template.convertAndSend(exchange, routingKey, messageData);

		return "Message sent to the RabbitMQ Successfully";
	}

	@PostMapping(value = "/publish-data")
	public String publish(@RequestBody AdminMessage customMessage) {

		template.convertAndSend(customMessage.getExchange(), customMessage.getRoutingKey(),
				customMessage.getMessageData());

		return "Message sent to the RabbitMQ Successfully";
	}
	@PostMapping(value = "/publish-employee-data")
	public String publish(@RequestBody Employee employee) {

		template.convertAndSend("direct-exchange", "admin",
				employee);

		return "Message sent to the RabbitMQ Successfully";
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
}
