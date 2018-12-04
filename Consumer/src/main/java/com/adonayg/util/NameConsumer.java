package com.adonayg.util;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.adonayg.domain.NameMessage;
import com.adonayg.service.ConsumerService;

@Component
public class NameConsumer {
	
	@Autowired
	private ConsumerService service;

	@JmsListener(destination = "Names", containerFactory = "myFactory")
	public void receiveMessage(NameMessage name) {
		name.set_id(ObjectId.get());
		service.add(name);
	}
}


