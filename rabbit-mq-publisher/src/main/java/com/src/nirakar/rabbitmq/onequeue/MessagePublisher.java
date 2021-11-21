package com.src.nirakar.rabbitmq.onequeue;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/one")
public class MessagePublisher {

	@Autowired
	private RabbitTemplate template;

	@PostMapping("/publish")
	public String publishMessage(@RequestBody CustomMessage customMessage) {
		customMessage.setMessageId(UUID.randomUUID().toString());
		customMessage.setMessageDate(new Date());

		template.convertSendAndReceive(MQConfig.MESSAGE_EXCHANGE, MQConfig.MESSAGE_ROUTING_KEY, customMessage);

		return "Message published sucessfully ";
	}
}
