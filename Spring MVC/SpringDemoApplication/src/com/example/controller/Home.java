package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class Home {
	@RequestMapping(value="reg")
	
	public String getregister() {
		return "register";
		
	}
    

}
