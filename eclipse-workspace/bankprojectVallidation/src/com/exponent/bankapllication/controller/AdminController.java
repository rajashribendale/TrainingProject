package com.exponent.bankapllication.controller;

import java.util.Scanner;

import com.exponent.bankapllication.service.RBI;
import com.exponent.bankapllication.serviceImpl.SBI;

public class AdminController {
	public static void main(String[] args) {
		
	

	Scanner sc = new Scanner(System.in);

	boolean flag = true;
	RBI rbi = new SBI();
	

		while (flag) {
			System.out.println("******************************************");

			System.out.println("!!       	   1:	Create Bank Account     	!!");
			System.out.println("!!          		2: 	Show Account Details		!!");
			System.out.println("!!			3: 	Show  Account balance		!!");
			System.out.println("!!			4:	Deposit Money				!!");
			System.out.println("!!			5:	Withdraw Money:				!!");
			System.out.println("!!			6:	Upadte Account Details		!!");
			System.out.println("!!			7:	Exit						!!");
			System.out.println("*******************************************");

			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				rbi.registerAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountDetails();
				break;
			case 4:
				rbi.DepositMoney();
				break;
			case 5:
				rbi.withdrawMoney();
				break;
			case 6:
				rbi.updateAccDetails();
				break;
			}
		}
		System.out.println("Thank You");
		sc.close();

	}

}
