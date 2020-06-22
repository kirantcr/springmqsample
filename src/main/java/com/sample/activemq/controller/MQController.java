package com.sample.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.activemq.service.MQService;

@RestController
public class MQController {
	
	@Autowired
	MQService mqService;
	
	@RequestMapping("/sendMessage/{message}")
	public String sendMessage(@PathVariable("message") String message) {
		
		return mqService.sendMessage(message);
	}

}
