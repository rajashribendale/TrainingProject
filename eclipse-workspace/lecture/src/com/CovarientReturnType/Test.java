package com.CovarientReturnType;

public class Test {

	public A M4() {
		// A a=new A();
		// B b = new B();
		C c = new C();

		return c;

	}

	public static void main(String[] args) {

		Test t = new Test();
//		 A a=t.M4();
//		System.out.println(a.i);
//		a.M1();

		A a = new A();
		a.i = 11;
		a.name = "rajshri";
		System.out.println(a);

		B b1 = new B();
		b1.i = 22;
		b1.name = "unnati";
		System.out.println(b1);

		C c1 = new C();
		c1.i = 23;
		c1.name = "Uday";
		System.out.println(c1);
//		
//		B b = (B)t.M4();
//				
//		System.out.println(b.j);
//		
//		b.M1();
//		b.M2();
//
		C c = (C) t.M4();
		System.out.println(c.k);

		c.M1();
		c.M2();
		c.M3();

	}
}
