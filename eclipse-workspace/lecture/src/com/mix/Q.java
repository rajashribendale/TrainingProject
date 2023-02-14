package com.mix;

import java.util.Scanner;

public class Q extends P {

	@Override
	public void m2() {
		
		System.out.println("what is ur token no ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		if (no <= 10) {
			System.out.println("come inside the office ");

			
			System.out.println("my toakn no is :" + no);

			System.out.println("tell me your name");
			String s = sc.next();
			System.out.println("my name is rajshri:" + s);

			System.out.println("Tell me mobile no");
			long l = sc.nextLong();
			System.out.println("my mobile no is :" + l);

			System.out.println("above  information is true");
			boolean b = sc.nextBoolean();
			System.out.println("all info is :" + b);

			System.out.println("collect ur updated card after 7 days");
			String c = sc.next();
		} else {
			System.out.println("Come next day");
		}
	}

	public static void main(String[] args) {
		Q q = new Q(); // child class object
		m1();
		q.m2();

	}
}
