package com.exponent.bankaplliaction.serviceImpl;

import java.util.Scanner;

import com.exponent.bankaplliaction.Service.RBI;
import com.exponent.bankaplliaction.model.Account;

public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
	Account[] accarray = new Account[2];

	private int getValidAccountNo() {
		System.out.println("Enter account no");
		int accno = sc.nextInt();
		String str = String.valueOf(accno);

		if (accno > 0 && str.length() == 3) {
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
		String StrMob = String.valueOf(mobNO);

		if (StrMob.length() == 10) {
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

	private String getvalidPanCard() {
		System.out.println("Enter your pan card Number");
		String pancardno = sc.next();
		String strpancard = String.valueOf(pancardno);
		if (strpancard.length() == 9) {
			System.out.println("valid Pan card no");
		} else {
			System.out.println("InVallid card no ..please enter again ");
			return getvalidPanCard();

		}
		return pancardno;
	}

	private long getvalidAdharCard() {
		System.out.println("Enetr AdharCard Number");
		long adharcardno = sc.nextLong();
		String stradharcard = String.valueOf(adharcardno);
		if (stradharcard.length() == 12) {
			System.out.println("Valid Adhar Card %s");
		} else {
			System.out.println("Invalid Adhar Card,Enter again");
			return getvalidAdharCard();
		}
		return adharcardno;
	}

	@Override
	public void registerAccount() {

		System.out.println("How many customer u want to added");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Account a = new Account();
			a.setAccNo(getValidAccountNo());

			System.out.println("***Enter Account Name***");
			String accname = sc.next();
			a.setAccName(accname);

			a.setPanCard(getvalidPanCard());
			a.setAdharCard(getvalidAdharCard());
			a.setMobNo(getValidMobNo());
			a.setAccBalance(getValidaccBalance());
			accarray[i] = a;
		}

		System.out.println("custumer  info successfully added");

	}

	@Override
	public void showAccountDetails() {

		System.out.println("Display Custmers Details");
		for (Account a : accarray)
			if (a != null) {

				System.out.println("Acconunt no" + a.getAccNo());
				System.out.println("Account name:" + a.getAccName());
				System.out.println("cust. Adhar card:" + a.getAdharCard());
				System.out.println("cust. pan card :" + a.getPanCard());
				System.out.println("cust. mobile no:" + a.getMobNo());
				System.out.println("Account bal:" + a.getAccBalance());
				System.out.println("*************************************");

			}

	}

	@Override
	public void ShowAccountBalance() {
		System.out.println("enetr account no to see the balance");
		int accno=sc.nextInt();
		System.out.println("Display Account  balance");
		for (Account acc : accarray)
			if (acc.getAccNo()==accno) {
				System.out.println("acc bal is:" + acc.getAccBalance());
			}

	}

	@Override
	public void DepositMoney() {
		System.out.println("Enter account no");
		int accountno = sc.nextInt();
		for (Account acc : accarray)
			if (acc.getAccNo() == accountno) {

				System.out.println("Enter amt u want to deposit");
				int amt = sc.nextInt();
				double accBal = acc.getAccBalance();
				accBal = accBal + amt;
				acc.setAccBalance(accBal);
				System.out.println("Bal after Deposited amt:" + acc.getAccBalance());

			}
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Enter account no");
		int accountno = sc.nextInt();
		for (Account acc : accarray)
			if (acc.getAccNo() == accountno) {
				System.out.println("Enter amt u want to withdraw");
				int amt = sc.nextInt();
				double accBal = acc.getAccBalance();
				accBal = accBal - amt;
				acc.setAccBalance(accBal);
				System.out.println("Bal after Deposited amt:" + acc.getAccBalance());

			}
	}

	@Override
	public void updateAccDetails() {
		System.out.println("ENTER ACCOUNT NO U WANT TO UPDATE ");
		int accno=sc.nextInt();
		boolean flag = true;
		for (Account a : accarray)
			if (a != null) {

				{

					while (flag) {
						System.out.println("!!!!!!!!!! 1:Update Name!!!!!!!!!!!!!");
						System.out.println("!!!!!!!!!! 2:Upadate Mobile no!!!!!!!!!!!!!");
						System.out.println("!!!!!!!!!! 3:Exit!!!!!!!!!!!!!");
						System.out.println("!!!!!!!!!! Choose option !!!!!!!!!!!!!");
						int ch = sc.nextInt();
						switch (ch) {
						case 1:
							System.out.println("Enter your new name ");
							String name = sc.next();
							System.out.println("new name updated succesfully");
							a.setAccName(name);
							break;

						case 2:
							System.out.println("Enter your new mobile no");
							long mobno = sc.nextLong();
							String strMobNo = String.valueOf(mobno);
							if (strMobNo.length() == 10) {
								System.out.println("Mobile no update successfully");
								a.setMobNo(mobno);
							} else {
								System.out.println("Inavlid no enter again");
							}
							break;
						case 3:
							flag = false;
							break;
						default:
							System.out.println("choose correct option");
							break;
						}

					}

				}

			}
	}
}