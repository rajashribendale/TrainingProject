package com.ThisKeyword;

public class R extends Student {

	long mob = 9876543l;

	R() {
		this(10);
		System.out.println("Mobile no is " + this.mob);

	}

	R(int i) {

		this('o');
		System.out.println("Student id:11");

	}

	R(char c) {
		this("abc");
		System.out.println("blood group:O+");

	}

	R(String s) {
		super();
		System.out.println("name of stu:Rajshri");
	}

	public static void main(String[] args) {
		R r = new R();

	}
}
