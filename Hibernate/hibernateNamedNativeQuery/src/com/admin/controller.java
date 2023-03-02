package com.admin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.student;
import com.util.HBUtil;

public class controller {
	public static void main(String[] args) {
		
	

	SessionFactory sf = HBUtil.getSessionFactory();
	Session session = sf.openSession();
	//addstudentdata(session);
	//getSingledata(session);
	//getLikeQueryData(session );
	//getNameAndMarksUsingId(session);
	//getAllNameAndMarksUsingId(session);
	//countdatausingId(session);
	maxmarks(session);
}
public static void addstudentdata(Session session) {
	student s=new student();
	s.setName("Bhagu");
	s.setAdress("pcmc");
	s.setMarks(78);
	session.beginTransaction();
	Query<student>query=session.getNamedNativeQuery("insert");
	query.setParameter(1,	s.getId());
	query.setParameter(2, s.getName());
	query.setParameter(3, s.getAdress());
	query.setParameter(4, s.getMarks());
	query.executeUpdate();
	
	

}
public static void getSingledata(Session session) {
	Query<student>query2=session.getNamedNativeQuery("singledata");
	query2.setParameter(1, 1);
	student stu=query2.getSingleResult();
	System.out.println(stu);
}

public static void getLikeQueryData(Session session) {
	
	Query<student> query = session.getNamedNativeQuery("likeQuery");
	List<student> list = query.getResultList();
	System.out.println(list);
}

public static void getNameAndMarksUsingId(Session session) {
	Query<Object[]> query = session.getNamedNativeQuery("customQuery");
	query.setParameter(1, 3);
	List<Object[]> obj = query.getResultList();
	for(Object[] o : obj) {
		System.out.println(o[0]+ " " +  o[1]);
	}

}
public static void getAllNameAndMarksUsingId(Session session) {
	Query<Object[]> query = session.getNamedNativeQuery("customQuery1");
	List<Object[]> obj = query.getResultList();
	for(Object[] o : obj) {
		System.out.println(o[0]+ "   " + o[1] );

}
}
public static void countdatausingId(Session session) {
	Query q=session.getNamedNativeQuery("count1");
	BigInteger count=(BigInteger) q.getSingleResult();
	System.out.println("count"   +count);
}

public static void maxmarks(Session session) {
	Query query=session.getNamedNativeQuery("maxmarks");
	Integer maxmarks=(Integer)query.getSingleResult();
	System.out.println("max marks" +maxmarks);
	
}

}