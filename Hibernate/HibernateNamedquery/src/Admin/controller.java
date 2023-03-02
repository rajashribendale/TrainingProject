package Admin;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entiy.student;
import com.util.HbUtil;

public class controller {
	public static void main(String[] args) {
		SessionFactory sf=HbUtil.getSessionFactory();
		Session session=sf.openSession();
//		
//		student s=new student();
//		s.setName("B");
//		s.setMarks(60);
//		s.setAdress("pune");
//		session.save(s);
//		session.beginTransaction().commit();
		
		Query<student>query=session.createNamedQuery("allstudent");
		List<student>slist=query.getResultList();
		System.out.println(slist);
		
		System.out.println("----------------------------------------------");
		Query<student> query2 = session.createNamedQuery("singleStudent");
		query2.setParameter("i", 1);
		student student = query2.getSingleResult();
		System.out.println(student);
		
		System.out.println("----------------------------------------------");
		Query<student> query3 = session.createNamedQuery("stuname");
		query3.setParameter("n", "A");
		student student1 = query3.getSingleResult();
		System.out.println(student1);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		Query<student> query4 = session.createNamedQuery("update");
		query4.setParameter("n", "F");
		query4.setParameter("a", "PUNE1");
		query4.setParameter("m", 45.0);
		query4.setParameter("i", 1);
		int i = query.executeUpdate();
		System.out.println("Updated Row Count : " + i);

	
		
		
		
	}

}
