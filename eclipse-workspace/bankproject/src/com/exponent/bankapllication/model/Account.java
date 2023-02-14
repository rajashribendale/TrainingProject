package com.exponent.bankapllication.model;

public class Account {


private int accountNo;
private String accountName;
private String aadharCard;
private String pancard;
private long mobNo;
private double accountBalance;




public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public String getAadharCard() {
	return aadharCard;
}
public void setAadharCard(String aadharCard) {
	this.aadharCard = aadharCard;
}
public String getPancard() {
	return pancard;
}
public void setPancard(String pancard) {
	this.pancard = pancard;
}
public long getMobNo() {
	return mobNo;
}
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}



}
