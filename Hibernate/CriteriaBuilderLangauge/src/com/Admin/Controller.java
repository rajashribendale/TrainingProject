package com.Admin;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Util.HBUtil;
import com.entity.Student;

public class Controller {

	public static void main(String[] args) {
		SessionFactory sf = HBUtil.getSessionFactory();
		Session session = sf.openSession();
		Student s = new Student();
//		s.setName("D");
//		s.setMarks(76.65);
//		s.setAddress("Pimpri");
//		session.save(s);
//		session.beginTransaction().commit();
//		System.out.println("data inserted");
//		
		//GetAllData(session);
		//GetSingledata(session);
		//GetNameStudent(session);
		getMultiSelectdata(session);
		//updateData(session);
	}

	public static void GetAllData(Session session) {
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Student> criteriaquery = builder.createQuery(Student.class);
		Root<Student> root = criteriaquery.from(Student.class);
		criteriaquery.select(root);
		org.hibernate.query.Query<Student> query = session.createQuery(criteriaquery);
		List<Student>list=query.getResultList();
		System.out.println(list);

	}
	
	public static void GetSingledata(Session session) {
		
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Student> criteriaquery = builder.createQuery(Student.class);
		Root<Student> root = criteriaquery.from(Student.class);
		criteriaquery.select(root).where(builder.equal(root.get("id"),3));
		org.hibernate.query.Query<Student>query=session.createQuery(criteriaquery);
		Student s=query.getSingleResult();
		System.out.println(s);
		
	}
	public static void GetNameStudent(Session session) {
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<String> criteriaquery = builder.createQuery(String.class);
		Root<Student>root=criteriaquery.from(Student.class);
							criteriaquery.select(root.get("name"));
		org.hibernate.query.Query<String>query=session.createQuery(criteriaquery);
		List<String> list3=query.getResultList();
//		System.out.println(list3);
		for (String string : list3) {
			System.out.println(string);
		}
			
		}
		
		public static void getMultiSelectdata(Session session) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Object[]> criteriaquery = builder.createQuery(Object[].class);
			Root<Student>root=criteriaquery.from(Student.class);
			criteriaquery.multiselect(root.get("name"),root.get("marks"));
			org.hibernate.query.Query<Object[]>query=session.createQuery(criteriaquery);
			List<Object[]>list4=query.getResultList();
//			System.out.println(list4);
			for (Object[] objects : list4) {
				System.out.println("name:"   +objects[0]+     "marks:"    +objects[1]);
			}
			
			
			
		}
		public static void updateData(Session session) {
			
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaUpdate<Student>update=builder.createCriteriaUpdate(Student.class);
			Root<Student>root=update.from(Student.class);
			update.set("name", "Rajshri");
			update.where(builder.equal(root.get("name"), "A"));
			session.createQuery(update).executeUpdate();
			
			
		}
							
		
	}


