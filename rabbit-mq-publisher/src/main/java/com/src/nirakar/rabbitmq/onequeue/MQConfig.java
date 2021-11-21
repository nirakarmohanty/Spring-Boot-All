package com.src.nirakar.rabbitmq.onequeue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {
	public static final String MESSAGE_ROUTING_KEY = "message_routingKey";
	public static final String MESSAGE_EXCHANGE = "message_exchange";
	public static final String MESSAGE_QUEUE = "message_queue";

	//public static final String MESSAGE_QUEUE_NEW = "message_queue_new";
	//public static final String MESSAGE_ROUTING_KEY_NEW = "message_routingKey_new";
	
	@Bean
	public Queue queue() {
		return new Queue(MESSAGE_QUEUE,false);
	}

	@Bean
	public TopicExchange topicExchange() {
		return new TopicExchange(MESSAGE_EXCHANGE);
	}

	@Bean
	public Binding binding(Queue queue, TopicExchange topicExchange) {
		return BindingBuilder.bind(queue).to(topicExchange).with(MESSAGE_ROUTING_KEY);
	}
	
	
	/*
	 * @Bean public Queue queueNew() { return new Queue(MESSAGE_QUEUE_NEW, false); }
	 * 
	 * @Bean public Binding bindingNew(Queue queueNew, TopicExchange topicExchange)
	 * { return
	 * BindingBuilder.bind(queueNew).to(topicExchange).with(MESSAGE_ROUTING_KEY_NEW)
	 * ; }
	 */
	@Bean
	public MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	public AmqpTemplate template(ConnectionFactory connectionFactory) {
		RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(messageConverter());
		return rabbitTemplate;

	}
}
