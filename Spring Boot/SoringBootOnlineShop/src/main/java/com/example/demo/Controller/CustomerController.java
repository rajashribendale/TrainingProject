package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.Model.Product;
import com.example.demo.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	

	@PostMapping(value="/addCust")
	public ResponseEntity<?> addCustInfo(@RequestBody Customer customer) {
		System.out.println("Checked Customer checked:"+customer);
		customerService.addCustInfo(customer);
		return new ResponseEntity("Customer Data Registered",HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/login")
	public ResponseEntity<Customer>getloginData(@RequestParam String uname,String pass){
		Customer customer=customerService.getLoginValue(uname, pass);
		return ResponseEntity.ok(customer);
	}
	
	@PostMapping(value = "/addProd/{uname}")
	public ResponseEntity<String >addprod(@PathVariable String uname,@RequestBody List<Product> product){
		
		System.out.println("Check product and Customer"+uname+" "+product);
		customerService.addProd(uname, product);
		
		return ResponseEntity.ok("product Added Succefully");
	}

}
