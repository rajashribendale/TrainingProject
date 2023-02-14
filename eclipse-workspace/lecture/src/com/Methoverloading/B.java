package com.Methoverloading;

public class B extends A {

	@Override
	public void m1() {

		System.out.println("m1 method overrided");
	}

	@Override
	public void m2(int i) {
		System.out.println("m2 method overided");
		System.out.println(i);
	}

	public void A() {
		System.out.println("access modifier change default to public");
	}

//	@Override
//	public N m4() {
//N i =new N();
//		System.out.println("overided m4 method "+i);
//		return 3;
	

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2(11); // child class overrided method
		b.A();
		b.m4();

		A a = new B(); // parent child mix
		a.m2(12); // child class overided method
	}

}
