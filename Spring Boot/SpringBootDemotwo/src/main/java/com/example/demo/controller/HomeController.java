package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.HomeService;
import com.example.demo.entity.Student;

@Controller
public class HomeController {
	
	
	@Autowired
	private HomeService homeservice;

	@RequestMapping(value="/")
	public String GetIndexPage() {
		System.out.println("Index Page Calling");
		return "index";
		
	}
	@RequestMapping(value="/reg")
	public String getRegisterddata(@ModelAttribute Student student) {
		System.out.println("Student Data:" +student);
		homeservice.AddStudentdata(student);
		return "login";
	}
	
	
	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam("uname") String un, @RequestParam("pass") String ps, Model model) {
		System.out.println("Loginn data" + un + " " + ps);
		List<Student> clist = homeservice.getLoginData(un, ps);
		if (clist != null ) {
			model.addAttribute("studentlist", clist);
			return "success";
		}
//		model.addAttribute("msg", "Invlid UserName and Password");
		return "login";
	}

	@RequestMapping(value = "/Edit")
	public String getEditData(@RequestParam(value = "id") int id, Model model) {
		System.out.println("id checked" + id);
		Student student = homeservice.getEditData(id);
		model.addAttribute("Student", student);
		return "edit";
	}

	@RequestMapping(value = "/up")
	public String getUpdateddata(@ModelAttribute Student student, Model model) {

		System.out.println("upadated credetails" + student);
		List<Student> slist = homeservice.getUpadtedinfo(student);
		if (slist != null) {
			model.addAttribute("studentlist", slist);
			return "success";
		}
		return "login";

	}

	@RequestMapping(value = "/del")
	public String getDeleedData(@RequestParam(value = "id") int id, Model model) {
		List<Student> slist = homeservice.getDeletedinfo(id);
		model.addAttribute("studentlist", slist);
		return "success";
	}
	
}
