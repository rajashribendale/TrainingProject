package com.model;

import java.lang.annotation.Retention;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test {

	
	
	@RequestMapping(value="log")
	public String getLoginData(@RequestParam("uname") String un
			,@RequestParam("pass") String ps) {
		System.out.println("login credetials:" +un+ "  "+ps);
		return "success";
	}
	
//	@RequestMapping(value="Reg")
//	public String getRegisterData(@RequestParam("name")String n,@RequestParam("mname")
//	String mn,@RequestParam("lname") String ln,@RequestParam("Email") String email
//	,@RequestParam("Mno") String mno,@RequestParam("adress") String adress) {
//		System.out.println("Registrtion credetails" +n+" "+mn+" "+ln+"" +email+"mno" +mno+ ""+adress);
//		return "done";
//	}
	
	@RequestMapping(value="Reg")
		public String getRegisterdata(@ModelAttribute customer customer) {
			System.out.println("Registrtion credetails" +customer );
			return "Login";
		}
	}
	

