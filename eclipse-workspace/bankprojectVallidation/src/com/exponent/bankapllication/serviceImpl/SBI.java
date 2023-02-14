package com.exponent.bankapllication.serviceImpl;

import java.util.Scanner;

import com.exponent.bankapllication.model.Account;
import com.exponent.bankapllication.service.RBI;

public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
	Account a = new Account();

	private int getValidAccountNo() {
		System.out.println("Enter account no");
		int accno = sc.nextInt();
		if (accno > 0) {
			System.out.println("valid account no");

		} else {
			System.out.println("inavlid account  no");
			return getValidAccountNo();

		}
		return accno;
	}

	private long getValidMobNo() {
		System.out.println("Enter Mobile no");
		long mobNO = sc.nextLong();
		if (mobNO > 1000000000 && mobNO <= 9999999999l) {
			System.out.println("Valid Mobile Number");

		} else {
			System.out.println("Invalid Mobile Number");
			return getValidMobNo();
		}
		return mobNO;
	}

	private double getValidaccBalance() {

		System.out.println("Enter opening balance");
		double accBalance = sc.nextLong();
		if (accBalance >= 0) {
			System.out.println("valid Acccount Balance");
		} else {
			System.out.println("insufficient Balance");
			return getValidaccBalance();

		}
		return accBalance;
	}

	@Override
	public void registerAccount() {
		int accno = getValidAccountNo();
		a.setAccNo(accno);

		System.out.println("***Enter Account Name***");
		String accname = sc.next();
		a.setAccName(accname);

		System.out.println("Enter your Adhar card Number");
		String adharno = sc.next();
		a.setAdharCard(adharno);

		System.out.println("Enter your pan card Number");
		String panno = sc.next();
		a.setPanCard(panno);

		long mobno = getValidMobNo();
		a.setMobNo(mobno);

		double accbal = getValidaccBalance();
		a.setAccBalance(accbal);
	}

	@Override
	public void showAccountDetails() {
		System.out.println("Enter account no");
		int accNo = sc.nextInt();
		if (a.getAccNo() == accNo) {
			System.out.println("Account No:" + a.getAccName());
			System.out.println("Account  Name:" + a.getAccName());
			System.out.println("Pan Card No" + a.getPanCard());
			System.out.println("Adhar card No:" + a.getAdharCard());
			System.out.println("Account Balance:" + a.getAccBalance());
			System.out.println("Mobile No:" + a.getMobNo());
		} else {
			System.out.println("Your Account doesn't exist here");
		}
	}

	@Override
	public void ShowAccountBalance() {
		System.out.println("Enter Account Number");
		int accno = sc.nextInt();
		if (a.getAccNo() == accno) {
			System.out.println("Yout Account Balance is" + a.getAccBalance());

		} else {
			System.out.println("aacount doesnot Exist");
		}

	}

	@Override
	public void DepositMoney() {
		System.out.println("Enter Account Number");
		int accno = sc.nextInt();

		if (a.getAccNo() == accno) {
			System.out.println("Enter amount u want to deposit");
			int amt = sc.nextInt();
			double accBal=a.getAccBalance();
			accBal = accBal + amt;
			a.setAccBalance(accBal);
			System.out.println("bal after deposited amt"+a.getAccBalance());

		}
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Enter Account Number");
		int accno = sc.nextInt();
		if (a.getAccNo() == accno) {
			System.out.println("Enter amount u want to withdraw");
			int amt = sc.nextInt();
			if (a.getAccBalance() >= amt) {
				double accBal=a.getAccBalance();
				 accBal = accBal - amt;
				System.out.println("amt debited" + amt);
				a.setAccBalance(accBal);
				System.out.println("bal after debited amt"+a.getAccBalance());
				
			} else {
				System.out.println("account doesnot Exist");

			}

		}

	}

	@Override
	public void updateAccDetails() {
		{
			System.out.println("Enter Account Number");
			int accno = sc.nextInt();
			if (a.getAccNo() == accno) {
//				boolean flag = true;
//				while (true) {
					System.out.println("!!!!!!!!!! 1:Upadate Name!!!!!!!!!!!!!");
					System.out.println("!!!!!!!!!! 2:Upadate Mobile no!!!!!!!!!!!!!");
					System.out.println("!!!!!!!!!! 3:Upadate your adress!!!!!!!!!!!!!");
					System.out.println("!!!!!!!!! Choose optipon !!!!!!!!!!!!!");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter your new name ");
						String name = sc.next();
						System.out.println("new name updated succesfully");
						a.setAccName(name);
						break;

					case 2:
						System.out.println("enter your new mobile no");
						long mobno = sc.nextLong();
						if (mobno > 1000000000 && mobno <= 9999999999l) {
							System.out.println("mobile no update successfully");
							a.setMobNo(mobno);
						} else {
							System.out.println("inavlid no enter again");
						}
						break;

					case 3:
//						flag = false;
						System.out.println("exit");
						break;
//					default:
//						System.out.println("thanku");
//					}
				}

			} else {
				System.out.println("Your Account doesn't exist here");
			}
		}
	}
}
