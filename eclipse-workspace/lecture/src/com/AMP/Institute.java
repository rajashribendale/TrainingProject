package com.AMP;

import com.AMProtected.Student;

public class Institute extends Student {

	public void GetstudentsIDDetails() {

		Institute I = new Institute();
		I.id = 101;
		I.name = "Rajshri";
		I.name = "Abc";
		I.adress = "pune";
		I.mobileNo = 987655432l;

		System.out.println(I);

	}

	public static void main(String[] args) {
		Institute i = new Institute();

		System.out.println("Id details");

		i.GetstudentsIDDetails();

	}

}
