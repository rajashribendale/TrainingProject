package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.customer;

@Repository
public class homeDaoImpl implements homeDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void AddCustomerData(customer customer) {
		System.out.println("Dao layer" + customer);
		Session session = sf.openSession();
		session.save(customer);
		session.beginTransaction().commit();
		System.out.println("data Stored ");
	}

	@Override
	public List<customer> getLoginData(String uname, String pass) {
		List<customer>list=new ArrayList<customer>();
		Session session = sf.openSession();
		if ("admin".equals(uname) && "admin".equals(pass)) {

			Query<customer> query = session.createQuery("from customer");
			List<customer> clist = query.getResultList();
			return clist;
		}else {
			try {
			Query<customer>query=session.createQuery("from customer where uname=:un and pass=:ps");
			query.setParameter("un", uname);
			query.setParameter("ps", pass);
			customer customer=query.getSingleResult();
			list.add(customer);
		
		return list;
			}catch(NoResultException e) {
				System.out.println("Inalid credentials");
				return list;
			}
			}

	}

	@Override
	public customer getEditData(int id) {
		Session session = sf.openSession();
		customer customer = session.get(customer.class, id);
		return customer;
	}

	@Override
	public List<customer> getUpadtedinfo(customer customer) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(customer);
//		session.getTransaction().commit();
		Query<customer> query = session.createQuery("from customer");
		List<customer> clist = query.getResultList();
		

		return clist;
	}

	@Override
	public List<customer> getDeletedinfo(int id) {
		Session session = sf.openSession();
		customer customer = session.get(customer.class, id);
		session.delete(customer);
		session.beginTransaction().commit();
		Query<customer> query = session.createQuery("from customer");
		List<customer> clist = query.getResultList();
		
		return clist;

	}
}