package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo {

	
	String Hash_Key= "OFF1-Product";
	@Autowired
	private RedisTemplate<String, Object> template;
	
	
	public Product save(Product product) {
		template.opsForHash().put(Hash_Key, product.getId(), product);
		return product;
	} 
	
	public List<Object> getAll(){
		
		return template.opsForHash().values(Hash_Key);
	}
	
	
	
}
