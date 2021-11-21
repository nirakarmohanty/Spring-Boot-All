package com.src.nirakar.rabbitmq.direct.multiple.queue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminMessage {
	private String exchange;
	private String routingKey;
	private String messageData;
}
