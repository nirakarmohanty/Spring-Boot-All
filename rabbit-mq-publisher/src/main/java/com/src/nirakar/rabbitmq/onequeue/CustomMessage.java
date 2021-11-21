package com.src.nirakar.rabbitmq.onequeue;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data
public class CustomMessage {

	private String messageId;
	private String message;
	private Date messageDate;
	private String messageType;

}
