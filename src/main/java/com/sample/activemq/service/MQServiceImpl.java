package com.sample.activemq.service;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MQServiceImpl implements MQService{
	
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired
	private Queue queue;

	@Override
	public String sendMessage(String message) {
		this.jmsMessagingTemplate.convertAndSend(this.queue, message);
		return "Successfully Sent Message";
	}

}
