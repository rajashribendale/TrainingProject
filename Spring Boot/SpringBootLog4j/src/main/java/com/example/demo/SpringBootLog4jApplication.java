package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.customer;

@SpringBootApplication
public class SpringBootLog4jApplication {

	private static final Logger logger = LogManager.getLogger(SpringBootLog4jApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog4jApplication.class, args);
		customer c = new customer();
		c.setId(11);
		c.setName("A");
		c.setAdress("Pune");
		if (c != null) {
			logger.info("customer Data" + c);
//		} 
//		else {
//			logger.error("customer not found");
//		}
		logger.warn("Getting input wrong..please enter Integer no");

	}
	}
}
