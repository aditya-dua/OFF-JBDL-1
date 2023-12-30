package com.example.demo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

@Service
// This is a Kafka Consumer
public class KafkaListener {

	private String topic_name="HW";
	
	@org.springframework.kafka.annotation.KafkaListener(topics="HW",groupId="group_id")
	public void consume(ConsumerRecord<String, String> payload) {
		System.out.println("Topic Name:"+payload.topic());
		System.out.println("Value :"+payload.value());
		System.out.println("To String :"+payload);
	}
	
}
