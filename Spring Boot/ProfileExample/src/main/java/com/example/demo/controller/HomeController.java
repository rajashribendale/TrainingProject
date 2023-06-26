package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Value(value="${myaplicationenv}")
	private String msg;
	
	
	
	@RequestMapping(value="/")
	public ModelAndView getData(Model model) {
		msg="check:"+msg;
		System.out.println(msg);
		model.addAttribute("msg", msg);
		
		return new ModelAndView("index", msg, HttpStatus.OK);
	}
	

}
