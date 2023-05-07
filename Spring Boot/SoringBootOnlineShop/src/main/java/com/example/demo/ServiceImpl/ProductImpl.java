package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repo.ProductRepository;
import com.example.demo.Service.Productservice;
@Service
public class ProductImpl implements Productservice{
	
	@Autowired
	private ProductRepository productrepository;

	@Override
	public void addProduct(Product product) {
		
	productrepository.save(product);
	}

	@Override
	public List<Product> getAll() {
		List<Product>plist=productrepository.findAll();
		return plist;
	}

	@Override
	public List<Product> getProd(String name) {
		List<Product >plist=(List<Product>) productrepository.findByName(name);
		return plist;
	}

}
