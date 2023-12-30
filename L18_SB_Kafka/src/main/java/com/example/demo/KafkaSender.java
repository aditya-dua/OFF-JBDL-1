package com.example.demo;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public static String topic_name="HW";
	
	public void send(String message) {
		//kafkaTemplate.send
		ProducerRecord<String, String> pr = new ProducerRecord<String, String>("HW", "Hello "+message);
		kafkaTemplate.send(pr);
		
		kafkaTemplate.send(topic_name, message);
	}
	
}
