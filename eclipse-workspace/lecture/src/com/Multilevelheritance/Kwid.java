package com.Multilevelheritance;

public class Kwid extends Kia {

	int carno = 1786;

	public void CarNumber() {

		System.out.println("My car no ");
	}

	public static void main(String[] args) {

		Kia k = new Kia();
		System.out.println("No of wheels :" + k.NoOfWheel);
		System.out.println("name of CarName:" + k.CarName);
		k.MovingForward();
	
		k.MovingBackward();

		
		Kwid kw = new Kwid();
		
		kw.CarNumber();
		System.out.println("My car no is"+kw.carno);
		kw.MovingForward();
		kw.MovingBackward();

	}
}