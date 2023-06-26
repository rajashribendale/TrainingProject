package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Entity.Customer;
import com.dao.ServiceDao;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private ServiceDao sd;

	@Override
	public void AddcustomerData(Customer customer) {
		sd.AddcustomerData(customer);
	}

	@Override
	public List<Customer> getLoginData(String uname, String pass) {
		return sd.getLoginData(uname, pass);
	}

	@Override
	public Customer getEditData(int id) {
		return sd.getEditData(id);
	}

	@Override
	public List<Customer> getUpadtedinfo(Customer customer) {
		return sd.getUpadtedinfo(customer);
	}

	@Override
	public List<Customer> getDeletedinfo(int id) {
		return sd.getDeletedinfo(id);
	}
	@Override
	public void addFileData(MultipartFile file) {
		sd.addFileData(file);
	}


}
