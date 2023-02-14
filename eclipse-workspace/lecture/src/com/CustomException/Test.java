package com.CustomException;

import java.util.Scanner;

public class Test {
public static void m1(int age) throws invalidAge {
	if(age<18) {
		throw new invalidAge("not able to drive");
	}else {
		System.out.println("valid age for drivling");
	}
	
}
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Your age ");
 int age=sc.nextInt();
 try {
	m1(age);
} catch (invalidAge e) {
	e.printStackTrace();
}
	
}
}
