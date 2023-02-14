package com;

public class TVShowroom {

	public TVShowroom addalltvdetail() {
		TVShowroom all = new TVShowroom();
		all.A.name = "Videocon";
		all.A.id = 10;
		all.A.adress = "pune";
		all.A.mobileno = 9986846;

		all.A1.name = "OnePlus";
		all.A1.id = 11;
		all.A1.adress = "nashik";
		all.A1.mobileno = 99847;

		all.A2.name = "LG";
		all.A2.id = 12;
		all.A2.adress = "Mumbai";
		all.A2.mobileno = 99887;

		all.A3.name = "samsung";
		all.A3.id = 13;
		all.A3.adress = "Nagar";
		all.A3.mobileno = 998877;

		return all;

	}
	public All A =new All();
	public All A1 =new All();
	public All A2= new All();
	public All A3 =new All();
	
	

	public static void main(String[] args) {

		TVShowroom T = new TVShowroom();
		TVShowroom Tv = T.addalltvdetail();

		System.out.println("comp.name:" + Tv.A.name);
		System.out.println("custid:" + Tv.A.id);
		System.out.println("comp.adress:" + Tv.A.adress);
		System.out.println("cust.mobileno:" + Tv.A.mobileno);

		System.out.println("comp.name:" + Tv.A1.name);
		System.out.println("custid:" + Tv.A1.id);
		System.out.println("comp.adress:" + Tv.A1.adress);
		System.out.println("cust.mobileno:" + Tv.A1.mobileno);

		System.out.println("comp.name:" + Tv.A2.name);
		System.out.println("custid:" + Tv.A2.id);
		System.out.println("comp.adress:" + Tv.A2.adress);
		System.out.println("cust.mobileno:" + Tv.A2.mobileno);

		System.out.println("comp.name:" + Tv.A3.name);
		System.out.println("custid:" + Tv.A3.id);
		System.out.println("comp.adress:" + Tv.A3.adress);
		System.out.println("cust.mobileno:" + Tv.A3.mobileno);

	}

}
