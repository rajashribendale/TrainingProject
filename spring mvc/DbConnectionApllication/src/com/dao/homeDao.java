package com.dao;

import java.util.List;

import com.model.customer;

public interface homeDao {

	void AddCustomerData(customer customer);

	List<customer> getLoginData(String uname, String pass);

	customer getEditData(int id);

	List<customer> getUpadtedinfo(customer customer);

	List<customer> getDeletedinfo(int id);
}
