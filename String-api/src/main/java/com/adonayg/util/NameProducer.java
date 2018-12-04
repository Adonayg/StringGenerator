package com.adonayg.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.adonayg.domain.Name;
import com.adonayg.domain.NameMessage;

@Component
public class NameProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private NameMessage nameMessage;

	public String produce(Name name) {
		nameMessage.setName(name.getName());
		jmsTemplate.convertAndSend("${que.name}", nameMessage);
		return "${successful.message}";
	}
}
