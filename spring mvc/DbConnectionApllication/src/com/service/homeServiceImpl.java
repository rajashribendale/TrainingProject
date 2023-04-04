package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.homeDao;
import com.model.customer;

@Service
public class homeServiceImpl implements homeService {

	@Autowired
	private homeDao hd;

	@Override
	public void AddCustomerData(customer customer) {
		System.out.println("in service layer Customer");
		hd.AddCustomerData(customer);

	}

	@Override
	public List<customer> getLoginData(String uname, String pass) {
		return hd.getLoginData(uname, pass);
	}

	@Override
	public customer getEditData(int id) {
		return hd.getEditData(id);
	}

	@Override
	public List<customer> getUpadtedinfo(customer customer) {
		return hd.getUpadtedinfo(customer);
	}

	@Override
	public List<customer> getDeletedinfo(int id) {
		return hd.getDeletedinfo(id);
	}

}
