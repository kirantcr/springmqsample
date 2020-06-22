package com.sample.activemq;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {
	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("jms/AuditQueue");
	}
	
	

}
