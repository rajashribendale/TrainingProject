package com.exponent.USM.serviceImpl;

import java.util.Scanner;
import com.exponent.USM.service.*;

import com.exponent.USM.model.User;
import com.exponent.USM.service.userService;

public class UserServiceImpl implements userService {
	Scanner sc = new Scanner(System.in);
	User[] userarray = new User[2];

	private int getValidUserId() {
		System.out.println("Enter user Id");
		int id = sc.nextInt();
		String strId = String.valueOf(id);

		if (strId.length() == 2) {
			System.out.println("Valid User Id");

		} else {
			System.out.println("Invalid userId");
			return getValidUserId();

		}
		return id;
	}

	private String getValidUserName() {
		System.out.println("Enter your name");
		String name = sc.next();

		return name;

	}

	private String getValidUserAdress() {
		System.out.println("Enter your adress");
		String adress = sc.next();

		return adress;

	}

	private long getValidUserMobNo() {
		System.out.println("Enetr Mobile No");
		long MobNo = sc.nextLong();
		String MobNoinstring = String.valueOf(MobNo);
		if (MobNoinstring.length() == 10) {
			System.out.println("mobile no is correct");

		} else {
			System.out.println("Incorrect Mobile No");
			return getValidUserMobNo();
		}
		return MobNo;

	}

//	public long userAdharCardInfo() {
//		Scanner sc1 = new Scanner(System.in);
//		long no = 0;
//		try {
//			System.out.println("Enter Adhar Card no");
//			no = sc1.nextInt();
//		} catch (Exception e) {
//			System.out.println("only Enter number.... do not Enter Alphabets...please ReEnter Mobile no");
//
//			return userAdharCardInfo();
//		}
//		return no;
//	}

	public String userPanCardInfo() {
		System.out.println("Enter your pan card Number");
		String pancardno = sc.next();
		String strpancard = String.valueOf(pancardno);
		if (strpancard.length() == 9) {
			System.out.println("valid Pan card no");
		} else {
			System.out.println("InVallid card no ..please enter again ");

			return userPanCardInfo();
		}

		return pancardno;
	}

	@Override
	public void addUsers() {
		System.out.println("add user called");
		System.out.println("How many user u want to add?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			User user = new User();
			user.setId(getValidUserId());
			user.setName(getValidUserName());
			user.setAddress(getValidUserAdress());
			user.setMobNo(getValidUserMobNo());
//			user.setAdharCard(userAdharCardInfo());
			user.setPanCard(userPanCardInfo());
			userarray[i] = user;
			System.out.println("user's info added successfully");
			System.out.println("-----------------------------------");

		}

	}

	@Override
	public void displayuserInformation() {

		System.out.println("choose opotion");
		boolean flag = true;
		{
			while (flag) {
				System.out.println("option 1: choose singleperson info");
				System.out.println("2: choose display all users information");
				System.out.println("3:Exit");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Show only single person information");
					String name = sc.next();
					for (int i = 0; i < userarray.length; i++) {

						if (userarray[i] != null && name.equalsIgnoreCase(userarray[i].getName())) {
							System.out.println("user Id: " + userarray[i].getId());
							System.out.println("user name:" + userarray[i].getName());
							System.out.println("User mpbile no:" + userarray[i].getMobNo());
							System.out.println("user adress:" + userarray[i].getAddress());
						}
					}
					break;
				case 2:

					System.out.println("Display User Information");
					for (User user : userarray) {
						if (user != null) {

//						String s = String.format("user Id: %s  Username: %s  Useradress: %s  UserMobile no: %s ",
//								user.getId(), user.getName(), user.getAddress(), user.getMobNo());
//						System.out.println(s);
						System.out.println("user name" + user.getName());
						System.out.println("user adress:" + user.getAddress());
						System.out.println("user Mobile No:" + user.getMobNo());
						System.out.println("*********************************");
					}
					}

					break;
				case 3:
					flag = false;
					break;
				default:
					System.out.println("invalid choice reenetr again");
				}
			}
		}

	}

	@Override
	public void deleteUser() {

//		this.displayuserInformation();
//		System.out.println("Enter user no from above list to delete");
//		int n = sc.nextInt();
//		userarray[n - 1] = null;

		int id = getValidUserDeleteId();
		int cnt = 0;
		for (int i = 0; i < userarray.length; i++) {
			User user = userarray[i];
			if (user != null && user.getId() == id) {
				
				break;
			}else {
				cnt++;
				
			}
			}
		userarray[cnt]=null;
		System.out.println("successfully deleted");
	}

	private int getValidUserDeleteId() {
		System.out.println("Enter user id from above list to delete");
		int deletid=sc.nextInt();
		boolean flag=false;
		for (int i = 0; i < userarray.length; i++) {
			User user = userarray[i];
			if (user != null && user.getId() == deletid) {
				flag=true;
				break;
			}
		}

		if(!flag) {
			System.out.println("invalid id ");
			return getValidUserDeleteId();
		}
		return deletid;
	}

	private int getvalidchoice() {
		Scanner sc1 = new Scanner(System.in);
		int ch = 0;
		try {
			System.out.println("enter no");
			ch = sc1.nextInt();
		} catch (Exception e) {
			System.out.println("only Enter number.... do not Enter  Name...please reneter no");
			return getvalidchoice();
		}
		return ch;
	}

	@Override
	public void updateUserInformation() {
		System.out.println("Enter user id from above list to update");
		boolean flag = true;
		for (User user : userarray) {
			if (user != null) {

				while (flag) {
					System.out.println("1:Update name");
					System.out.println("2:Upadate adress");
					System.out.println("3:exit");

					System.out.println("Select field to update users Information ");
					int ch = this.getvalidchoice();

					switch (ch) {
					case 1:
						System.out.println("Enter new name");
						String name = sc.next();
						user.setName(name);
						break;
					case 2:
						System.out.println("Enter new Adress");
						String adress = sc.next();
						user.setAddress(adress);

						System.out.println("user has been updated");
						break;
					case 3:
						flag = false;
						break;
					default:
						System.out.println("Choose correct field");
						break;
					}
				}
			}

		}

	}

}
