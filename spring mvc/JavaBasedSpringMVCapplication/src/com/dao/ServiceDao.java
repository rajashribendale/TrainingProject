package com.dao;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.Entity.Customer;

public interface ServiceDao {
	
	void AddcustomerData(Customer customer);
	List<Customer> getLoginData(String uname, String pass);
	Customer getEditData(int id);

	List<Customer> getUpadtedinfo(Customer customer);

	List<Customer> getDeletedinfo(int id);
	void addFileData(MultipartFile file);

}
