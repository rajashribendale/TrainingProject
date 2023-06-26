package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Customer;
import com.example.demo.Model.Product;

public interface CustomerService {
	
	void addCustInfo(Customer customer);
	
	Customer getLoginValue(String uname,String pass);
	
	void addProd(String uname,List<Product> product);

}
