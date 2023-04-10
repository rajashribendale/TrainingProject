package com.example.demo.Dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Student;

@Repository
public class HomedaoImpl implements HomeDao {
	
	@Autowired
	private SessionFactory sf;
	

	@Override
	public void AddStudentdata(Student student) {
		Session session = sf.openSession();
		session.save(student);
		session.beginTransaction().commit();
				
	}


	@Override
	public List<Student> getLoginData(String uname, String pass) {
		List<Student>list=new ArrayList<Student>();
		Session session=sf.openSession();
		if ("admin".equals(uname) && "admin".equals(pass)) {

			org.hibernate.query.Query<Student> query = session.createQuery("from Student");
			list = query.getResultList();
			
		}else {
			
			org.hibernate.query.Query<Student>query=session.createQuery("from Student where uname=:un and pass=:ps");
			query.setParameter("un", uname);
			query.setParameter("ps", pass);
			Student student=query.getSingleResult();
			list.add(student);
		
			}
		return list;
		
		
	}


	@Override
	public Student getEditData(int id) {
		Session session = sf.openSession();
		Student student = session.get(Student.class, id);
		return student;
	}


	@Override
	public List<Student> getUpadtedinfo(Student student) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(student);
//		session.getTransaction().commit();
		org.hibernate.query.Query<Student> query = session.createQuery("from Student");
		List<Student> clist = query.getResultList();
		

		return clist;
	}


	@Override
	public List<Student> getDeletedinfo(int id) {
		Session session = sf.openSession();
		Student student	 = session.get(Student.class, id);
		session.delete(student);
		session.beginTransaction().commit();
		org.hibernate.query.Query<Student>  query = session.createQuery("from Student");
		List<Student> list = query.getResultList();
		
		return list;
	}

}
