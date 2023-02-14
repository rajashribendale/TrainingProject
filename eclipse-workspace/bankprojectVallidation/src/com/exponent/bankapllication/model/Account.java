package com.exponent.bankapllication.model;

public class Account {
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
	public String getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
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
	private int accNo;
	private String accName;
	private String adharCard;
	private String panCard;
	private long mobNo;
	private double accBalance;
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", adharCard=" + adharCard + ", panCard=" + panCard
				+ ", mobNo=" + mobNo + ", accBalance=" + accBalance + "]";
	}
	

}
