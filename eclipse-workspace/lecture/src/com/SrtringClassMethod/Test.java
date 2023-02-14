package com.SrtringClassMethod;

public class Test {

	public static void main(String[] args) {
		String s = "Hi How are you?";
		System.out.println(s);

		s = s.trim();
		System.out.println(s);

		s = s.toLowerCase();
		System.out.println(s);

		s = s.toUpperCase();
		System.out.println(s);

		System.out.println(s.length());

		int i = s.indexOf('a');
		System.out.println(i);

		

		char[] chararray = s.toCharArray();
		for (char c : chararray) {
			System.out.println(c);
		}

		String[] strarray = s.split("  ");
		for (String str : strarray) {
			System.out.println(str);

			String s4 = "Hii:: how::are::you";
			String[] strarray2 = s.split("::");
			
			for (String string : strarray2) {
				System.out.println(string);

				String s3 = new String("abc").intern(); // heap are to pool are
			}

		}

	}
}
