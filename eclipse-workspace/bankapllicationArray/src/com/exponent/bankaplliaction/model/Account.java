package com.exponent.bankaplliaction.model;

public class Account {

	
	private int accNo;
	private String accName;
	private long adharCard;
	private String panCard;
	private long mobNo;
	private double accBalance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public long getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(long adharCard) {
		this.adharCard = adharCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String string) {
		this.panCard = string;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
}
