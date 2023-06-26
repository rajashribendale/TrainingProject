package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.Entity.Customer;
import com.Service.HomeService;

@Controller
public class HomeController {

	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/")
	public String getIndexPage() {
		return "Index";
	}

	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public String GetRegisterData(@ModelAttribute Customer customer) {
		System.out.println("Register data");
		homeService.AddcustomerData(customer);
		return "Login";
	}

	@RequestMapping(value = "/log", method = RequestMethod.POST)
	public String getLoginData(@RequestParam("uname") String un, @RequestParam("pass") String ps, Model model) {
		System.out.println("Loginn data" + un + " " + ps);
		List<Customer> clist = homeService.getLoginData(un, ps);
		if (clist != null ) {
			model.addAttribute("customerlist", clist);
			return "success";
		}
//		model.addAttribute("msg", "Invlid UserName and Password");
		return "Login";
	}

	@RequestMapping(value = "/Edit",method = RequestMethod.POST)
	public String getEditData(@RequestParam(value = "id") int id, Model model) {
		System.out.println("id checked" + id);
		Customer customer = homeService.getEditData(id);
		model.addAttribute("Customer", customer);
		return "edit";
	}

	@RequestMapping(value = "/up",method = RequestMethod.POST)
	public String getUpdateddata(@ModelAttribute Customer customer, Model model) {

		System.out.println("upadated credetails" + customer);
		List<Customer> clist = homeService.getUpadtedinfo(customer);
		if (clist != null) {
			model.addAttribute("customerlist", clist);
			return "success";
		}
		return "Login";

	}

	@RequestMapping(value = "/del",method = RequestMethod.POST)
	public String getDeleedData(@RequestParam(value = "id") int id, Model model) {
		List<Customer> clist = homeService.getDeletedinfo(id);
		model.addAttribute("customerlist", clist);
		return "success";
	}
	@RequestMapping(value="/upload",method=RequestMethod.POST)
		public String addFileData(@RequestPart MultipartFile file) {
		
		System.out.println("file name"+  file.getOriginalFilename());
		homeService.addFileData(file);
			return "index";
		}
	}


