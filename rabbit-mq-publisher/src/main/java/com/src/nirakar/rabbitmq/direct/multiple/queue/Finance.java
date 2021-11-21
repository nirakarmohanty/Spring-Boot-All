package com.src.nirakar.rabbitmq.direct.multiple.queue;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Finance {
	
	private String messageId;
	private Date date;

}
