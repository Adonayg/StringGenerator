package com.adonayg.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	@Value("${que.name}")
	private String queName;

	public String produce(Name name) {
		nameMessage.setName(name.getName());
		jmsTemplate.convertAndSend(queName, nameMessage);
		return "${successful.message}";
	}
}
