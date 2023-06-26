package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.Customer;
import com.example.demo.Model.Product;
import com.example.demo.Repo.CustomerRepository;
import com.example.demo.Service.CustomerService;

@Service
public class CustomerImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository CustomerRepository;

	@Override
	public void addCustInfo(Customer customer) {
		CustomerRepository.save(customer);
	}

	@Override
	public Customer getLoginValue(String uname, String pass) {
		
		Customer customer=CustomerRepository.findByUnameAndPass(uname, pass);
		return customer;
	}

	@Override
	public void addProd(String uname, List<Product> product) {
		Customer customer=CustomerRepository.findByUname(uname);
		if(customer!=null) {
			customer.getPlist().addAll(product);
			CustomerRepository.save(customer);
		}
		
		
	}



	

	

}
