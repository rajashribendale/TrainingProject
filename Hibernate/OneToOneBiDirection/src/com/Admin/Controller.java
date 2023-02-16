package com.Admin;

import java.util.Scanner;

import com.Service.UserService;
import com.Service.UserServiceImpl;

public class Controller {
	public static void main(String[] args) {

		System.out.println("************* Application Start******************");

		UserService us = new UserServiceImpl();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Add userdata and Login.");
			System.out.println("2. Show All Data.");
			System.out.println("3. Get Single Data using User Id");
			System.out.println("4. update User Data Only  Using UserData.");
			System.out.println("5. update Login  Data Using UserId.");
			System.out.println("6. deletes User Data Using  UserDta.");
			System.out.println("7.delete Login Data Using UserData");
			System.out.println("8.select AllData Using Login Data");
			System.out.println("9.get SingleData Using LoginId");
			System.out.println("10.update UserData Using LoginId");
			System.out.println("11.update Login DataOnly");
			System.out.println("12.delete Login Data");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				us.addUserdatawithLogindata();
				break;
			case 2:
				us.showAlldatausinguserData();
				break;
			case 3:
				us.getSingledataUsingUserDta();
				break;
			case 4:
				us.updateUserDataOnlyUsingUserData();
				break;
			case 5:
				us.updateLoginDataUsingUserId();
				break;
			case 6:
				us.deletesUserDataUsingUserDta();
				break;
			case 7:
				us.deleteLoginDataUsingUserData();
				break;

			case 8:
				us.selectAllDataUsingLoginData();
				break;

			case 9:
				us.getSingleDataUsingLoginId();
				break;

			case 10:
				us.updateUserDataUsingLoginId();
				break;

			case 11:
				us.updateLoginDataOnly();
				break;
			case 12:
				us.deleteLoginData();
				break;
			default:
				System.out.println("Invalid choice..pleasev reEnter");
				break;
			}
		}
	}

}
