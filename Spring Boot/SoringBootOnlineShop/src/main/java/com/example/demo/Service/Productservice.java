package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Product;

public interface Productservice {
	
	void addProduct(Product product);
	
	List<Product> getAll();
	
	List<Product>getProd(String name);

}
