package com.sample.activemq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MQListenerImpl {

	@JmsListener(destination = "jms/AuditQueue")
	public void receiveMessage(String message) {
		System.out.println("Received Message"+message);
	}
	
	
}
