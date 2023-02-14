package com.exponent.bankaplliaction.Controller;

import java.util.Scanner;

import com.exponent.bankaplliaction.Service.RBI;
import com.exponent.bankaplliaction.model.Account;
import com.exponent.bankaplliaction.serviceImpl.SBI;

public class AdminController {
	public static void main(String[] args) {
		System.out.println("WELCOME TO BANKING APLLICATION");
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
				rbi.ShowAccountBalance();
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
