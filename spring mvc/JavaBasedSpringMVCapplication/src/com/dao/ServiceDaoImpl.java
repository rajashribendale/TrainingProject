package com.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.Entity.Customer;
import com.Entity.fileData;
@Repository
public class ServiceDaoImpl implements ServiceDao {

	@Autowired
	private SessionFactory sf;
	
	
	
	@Override
	public void AddcustomerData(Customer customer) {
		Session session=sf.openSession();
		session.save(customer);
		session.beginTransaction().commit();
	}



	@Override
	public List<Customer> getLoginData(String uname, String pass) {
		List<Customer>list=new ArrayList<Customer>();
		Session session = sf.openSession();
		if ("admin".equals(uname) && "admin".equals(pass)) {

			Query<Customer> query = session.createQuery("from Customer");
			list = query.getResultList();
			
		}else {
			
			Query<Customer>query=session.createQuery("from Customer where uname=:un and pass=:ps");
			query.setParameter("un", uname);
			query.setParameter("ps", pass);
			Customer customer=query.getSingleResult();
			list.add(customer);
		
			}
		return list;
	}

		
	



	@Override
	public Customer getEditData(int id) {
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}



	@Override
	public List<Customer> getUpadtedinfo(Customer customer) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(customer);
//		session.getTransaction().commit();
		Query<Customer> query = session.createQuery("from Customer");
		List<Customer> clist = query.getResultList();
		

		return clist;
	}



	@Override
	public List<Customer> getDeletedinfo(int id) {
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		session.beginTransaction().commit();
		Query<Customer> query = session.createQuery("from Customer");
		List<Customer> clist = query.getResultList();
		
		return clist;
	}



	@Override
	public void addFileData(MultipartFile file) {
		Session session = sf.openSession();
		try {
			fileData filedata = new fileData();
			filedata.setFilename(file.getOriginalFilename());
			filedata.setFileinfo(file.getBytes());
			session.save(filedata);
			session.beginTransaction().commit();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	}


