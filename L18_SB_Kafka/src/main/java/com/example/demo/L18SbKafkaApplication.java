package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class L18SbKafkaApplication {

	@Autowired
	KafkaSender kafkaSender;
	
	public static void main(String[] args) {
		SpringApplication.run(L18SbKafkaApplication.class, args);
	}
	
	@GetMapping("/producer")
	public String producer(@RequestParam("message")String message) {
		
		kafkaSender.send(message);
		
		return "Message "+message+" streamed to :: "+kafkaSender.topic_name;
	 }

}
