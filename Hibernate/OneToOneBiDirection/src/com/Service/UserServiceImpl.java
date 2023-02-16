package com.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.Login;
import com.entity.UserData;
import com.util.Hbutil;

public class UserServiceImpl implements UserService {
	SessionFactory sf = Hbutil.getSessionFactory();
	Session session = sf.openSession();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addUserdatawithLogindata() {
		System.out.println("Add data");
		System.out.println("how many Users u want  to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			UserData ud = new UserData();
			System.out.println("Enter User First name");
			ud.setFname(sc.next());

			System.out.println("Enter last  name");
			ud.setLname(sc.next());

			Login l = new Login();

			System.out.println("Enter User EmailId");
			l.setEmail(sc.next());

			System.out.println("Enter User Password");
			l.setPassword(sc.next());

			ud.setLogin(l);
			session.save(ud);
			l.setUserdata(ud);
			session.save(l);
			session.beginTransaction().commit();
			System.out.println("Data inserted");
		}
	}

	@Override
	public void showAlldatausinguserData() {
		System.out.println("Show all data");
		Query<UserData> query = session.createQuery("from UserData");
		List<UserData> list = query.getResultList();
		System.out.println("----------------------------------------------------------------");
		System.out.println(list);
		System.out.println("----------------------------------------------------------------");

	}

	@Override
	public void getSingledataUsingUserDta() {
		System.out.println("To get single Person detials");
		System.out.println("Enter User Id");
		int id = sc.nextInt();
		UserData ud = session.get(UserData.class, id);
		System.out.println(ud);

	}

	@Override
	public void updateUserDataOnlyUsingUserData() {
		System.out.println("Enter User id");
		int id = sc.nextInt();
		UserData ud = session.get(UserData.class, id);

		System.out.println("Enter new fname of User");
		ud.setFname(sc.next());

		System.out.println("Enter new lname of user");
		ud.setLname(sc.next());

		session.update(ud);
		session.beginTransaction().commit();
		System.out.println("Users Data updated successfully");

	}

	@Override
	public void updateLoginDataUsingUserId() {
		System.out.println("Enter User id");
		int id = sc.nextInt();
		UserData ud = session.get(UserData.class, id);

		Login l = new Login();
		System.out.println("enter new EmailId");
		l.setEmail(sc.next());

		System.out.println("Enter New Password");
		l.setPassword(sc.next());

		ud.setLogin(l);
		session.save(ud);
		session.beginTransaction().commit();
		System.out.println("Users Login data upadted succefully");
	}

	@Override
	public void deletesUserDataUsingUserDta() {
		System.out.println("Enter User id");
		int id = sc.nextInt();
		UserData ud = session.get(UserData.class, id);
		if (ud != null) {
			session.delete(ud);
			session.beginTransaction().commit();
			System.out.println("data deleted");

		} else {
			System.out.println("Id not found..please reEnetr");
		}
	}

	@Override
	public void deleteLoginDataUsingUserData() {

		System.out.println("Enter User id");
		int id = sc.nextInt();
		UserData ud = session.get(UserData.class, id);
		if (ud != null) {
			Login l = ud.getLogin();
			ud.setLogin(null);
			session.update(ud);
			session.delete(l);
			session.beginTransaction().commit();
			System.out.println("user Login data deleted");
		} else {
			System.out.println("Id not found");
		}

	}

	@Override
	public void selectAllDataUsingLoginData() {
		System.out.println("Show all data using login");
		Query<Login> query = session.createQuery("from Login");
		List<Login> list = query.getResultList();
		for (Login login : list) {
				System.out.println("----------------------------------------------------------------");
				System.out.println("Login Id         : " + login.getId());
				System.out.println("Login Email      : " + login.getEmail());
				System.out.println("Login Password   : " + login.getPassword());
				System.out.println("UserData Id      : " + login.getUserdata().getId());
				System.out.println("User FirstName   : " + login.getUserdata().getFname());
				System.out.println("User LastName    : " + login.getUserdata().getLname());
				System.out.println("----------------------------------------------------------------");
			}

		}

	

	@Override
	public void getSingleDataUsingLoginId() {
		System.out.println("To get single Person Login detials");
		System.out.println("Enter Login Id");
		int id = sc.nextInt();
		Login ld = session.get(Login.class, id);
		System.out.println(ld);

	}

	@Override
	public void updateUserDataUsingLoginId() {
		System.out.println("Enter Login id");
		int id = sc.nextInt();
		Login ld = session.get(Login.class, id);

		UserData ud = new UserData();
		System.out.println("enter new User Fname");
		ud.setFname(sc.next());

		System.out.println("Enter New User lname ");
		ud.setLname(sc.next());

		ld.setUserdata(ud);
		session.save(ld);
		session.beginTransaction().commit();
		System.out.println("Users Login data upadted succefully");

	}

	@Override
	public void updateLoginDataOnly() {
		System.out.println("Enter Login id");
		int id = sc.nextInt();
		Login ld = session.get(Login.class, id);

		System.out.println("Enter new EmailId of User");
		ld.setEmail(sc.next());

		System.out.println("Enter new Password of user");
		ld.setPassword(sc.next());
		session.update(ld);
		session.beginTransaction().commit();
		System.out.println("Users Data updated successfully");

	}

	@Override
	public void deleteLoginData() {
		System.out.println("Enter LogIn id");
		int id = sc.nextInt();
		Login Ld = session.get(Login.class, id);
		if (Ld != null) {
			session.delete(Ld);
			session.beginTransaction().commit();
			System.out.println("data deleted");

		} else {
			System.out.println("Id not found..please reEnetr");
		}

	}

}