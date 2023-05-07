package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.BankAccount;

@RestController
public class consumerController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/conbankdata/{acNo}")
	public ResponseEntity<BankAccount> ConsumerBankaccountdata(@PathVariable("acNo") double acNo) {
		ResponseEntity<BankAccount> responseEntity = restTemplate.getForEntity("http://localhost:9000/get/1001d" ,
				BankAccount.class);
		BankAccount bank = responseEntity.getBody();
		return responseEntity.ok(bank);

	}

}
