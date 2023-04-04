package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.customer;
import com.service.homeService;

@Controller
public class Test {
	
	 
	@Autowired
	private homeService hs;

	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam("uname") String un, @RequestParam("pass") String ps,Model model) 
	{
		System.out.println("login credetials:" + un + "  " + ps);
		List<customer>clist=hs.getLoginData(un, ps);
		if(clist!=null && !clist.isEmpty()) {
			model.addAttribute("customerlist", clist);
		return "success";
		}
		model.addAttribute("msg", "Invlid UserName and Password");
		return "Login";
	}

	@RequestMapping(value = "Reg")
	public String getRegisterdata(@ModelAttribute customer customer) {
		System.out.println("Registrtion credetails" + customer);
		hs.AddCustomerData(customer);
		return "Login";
	}
	@RequestMapping(value="/Edit")
	public String getEditData(@RequestParam(value="id")int id,Model model){
		System.out.println("id checked" +id);
		customer customer=hs.getEditData(id);
		model.addAttribute("customer", customer);
		return "edit";
	}
	@RequestMapping(value="/up")
	public String getUpdateddata(@ModelAttribute customer customer,Model model) {
		
		System.out.println("upadated credetails" + customer);
		List<customer>clist=hs.getUpadtedinfo(customer);
		if(clist!=null) {
			model.addAttribute("customerlist", clist);
		return "success";
		}
		return "Login";
		
		
}
	@RequestMapping(value="/del")
	public String getDeleedData(@RequestParam(value="id")int id,Model model) {
		List<customer>clist=hs.getDeletedinfo(id);
		model.addAttribute("customerlist",clist);
		return "success";
	}
	
}