package com.Typecasting;

public class Narrowingcasting {
	public static void main(String[] args) {

		double d = 123.4567;

		float f = (float) d;
		long l = (long) d;
		int i = (int) d;
		short s = (short) d;
		byte b = (byte) d;

		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);

	}

}
