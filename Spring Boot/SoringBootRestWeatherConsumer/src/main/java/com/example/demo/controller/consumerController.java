package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;


public class consumerController {
	
	@Autowired
	private RestTemplate RestTemplate;
	
	@GetMapping(value="/temp/{districtNew}/{cityNew}/{villegeNew}")
	public ResponseEntity<Integer> consumerVillege(@PathVariable String districtNew,@PathVariable String cityNew,
			@PathVariable String villegeNew){
		
		ResponseEntity<Integer> responseentity=RestTemplate.getForEntity("http://localhost:8080/temp/pune/haveli/khed",Integer.class);
		Integer i=responseentity.getBody();
		return responseentity.ok(i);
	}

}
