package com.exponent.bankapllication.serviceImpl;

import java.util.Scanner;

import com.exponent.bankapllication.model.Account;
import com.exponent.bankapllication.service.RBI;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account(); // create object of account class

	@Override
	public void registeraccount() {

		System.out.println("***Enter Account No:***");
		int accno = sc.nextInt();
		ac.setAccountNo(accno);

		System.out.println("***Enter Account Name***");
		String accname = sc.next();
		ac.setAccountName(accname);

		System.out.println("***Enter adharcard no***");
		String adharno = sc.next();
		ac.setAadharCard(adharno);

		System.out.println("***Enter pan Card Details***");
		String pancar = sc.next();
		ac.setPancard(pancar);

		System.out.println("***Enter your Mobile no***");
		long mobNo = sc.nextLong();
		ac.setMobNo(mobNo);

		System.out.println("***Enter account balance***");
		double accb = sc.nextDouble();
		ac.setAccountBalance(accb);
	}

	@Override
	public void showAccountDetails() {

		System.out.println("**Enter Account number**");
		int accno = sc.nextInt();
		if (ac.getAccountNo() == accno) {
			System.out.println("account no is:" + ac.getAccountNo());
			System.out.println("Account name is:" + ac.getAccountName());
			System.out.println("Adhar card no is:" + ac.getAadharCard());
			System.out.println("Pan Crad no is:" + ac.getPancard());
			System.out.println("Mobile no is :" + ac.getMobNo());
			System.out.println("Account Balance is" + ac.getAccountBalance());
		} else {
			System.out.println("account doesnot exit");
		}

	}

	@Override
	public void showAccountBalance() {

		System.out.println("**Enter account number**");
		int accno = sc.nextInt();
		if (ac.getAccountNo() == accno) {
			System.out.println("Your acoount Balance is:  " + ac.getAccountBalance());
		}else {
			System.out.println("insufficient balance");
		}

	}

	@Override
	public void depositMoney() {

		System.out.println("**Enter account number**");
		int accno = sc.nextInt();
		if (ac.getAccountNo() == accno) {
			System.out.println("Enter Amount u want to deposit ");

			int amt = sc.nextInt();
			double updatedBalance = ac.getAccountBalance() + amt;
			ac.setAccountBalance(updatedBalance);
			System.out.println("your current balance is:   " + ac.getAccountBalance());
		}

	}

	@Override
	public void withdrawMoney() {

		System.out.println("***Enter Amount u want to withdraw*** ");
		double amt = sc.nextDouble();

		if (ac.getAccountBalance() >= amt) {

			double currentBalance = ac.getAccountBalance() - amt;
			ac.setAccountBalance(currentBalance);
			System.out.println("your current balance is:    " + ac.getAccountBalance());

		} else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public void updateAccountDetails() {
		System.out.println("enter account no");
		int accno = sc.nextInt();
		if (ac.getAccountNo() == accno) {
			System.out.println("for update your account  please provide information ");
			Scanner sc = new Scanner(System.in);

			System.out.println("1:Update your name");
			System.out.println("2:upadate Mobile Number");

			System.out.println("enter Choice ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter your name");
				String name = sc.next();
				ac.setAccountName(name);
				System.out.println("Updated name:" + name);
				break;

			case 2:

				System.out.println("Enter your mobile no");
				long mobNo = sc.nextLong();
				ac.setMobNo(mobNo);
				System.out.println("updated mobile no:" + mobNo);
				break;
			}

			System.out.println("your account information update successfully completed");

		} else {
			System.out.println("invalid account no");
		}

	}
}