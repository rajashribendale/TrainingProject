package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Service.Productservice;

@RestController
public class productController {
	
	@Autowired
	Productservice productservice;
	
	@PostMapping(value="/addProd")
		public ResponseEntity<String> addProductdetails(@RequestBody Product product){
		
		System.out.println("check product details:"+product);
		productservice.addProduct(product);
		
		return new ResponseEntity("Product Save Successfully",HttpStatus.CREATED);
	}
	@GetMapping(value="/getAll")
	public ResponseEntity<List<Product>>getAll(){
		
		List<Product>plist=productservice.getAll();
		return ResponseEntity.ok(plist);
		
	}
	
	@GetMapping(value="/getProd/{name}")
	public ResponseEntity<List<Product>> getprod(@PathVariable String name){
		System.out.println("Checked prod by name"+name);
		List<Product>plist1=productservice.getProd(name);
		return ResponseEntity.ok(plist1);
	}

}
