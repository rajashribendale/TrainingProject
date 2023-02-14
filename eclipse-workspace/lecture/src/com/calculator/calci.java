package com.calculator;

public class calci {

	public int div(int i, int j) {
		int k = i / j;
		return k;
	}

	public int multi(int s, int k) {
		int m = s * k;
		return m;
	}

	public int add(int i, int j, int m, int a) {
		int A = i + j * m + a;
		return A;
	}

	public static void main(String[] args) {

		calci d = new calci();
		int ans1 = d.div(10, 5);
		System.out.println("division:" + ans1);

		int M = d.multi(20, 10);
		System.out.println("multiplicatin:" + M);

		int R = d.add(10, 20, 30, 40);
		System.out.println("all calculation:" + R);

	}

}
