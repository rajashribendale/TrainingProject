package com.SrtringClassMethod;

import javax.swing.Spring;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***********Format method************");
		String s1 = "hello";
		String s2 = "world";

		String s3 = String.format(" %s %s", s1, s2);
		System.out.println(s3);

		System.out.println("***********valueof method***********");
		int i = 11;
		double a = 10.2;
		String s = String.valueOf(i);
		// converts int long boolean ,char array into string
		System.out.println(s + 20);

		String s7 = String.valueOf(a);
		System.out.println(s7);

		char v = 'a';
		String s4 = String.valueOf(v);
		System.out.println(s4 + 10);

		System.out.println("*********substring method************");
		String s5 = "hello world"; // start from index 0 if we select specific index no its start from this no
		String result = s5.substring(2);// output is llo word
		System.out.println(result);

		System.out.println("*********subsequence method************");
		CharSequence cs = s5.subSequence(0, 7);// output is hello w
		System.out.println(cs);

		System.out.println("***********Join Method*********************");
		String a1 = "hii";
		String b = "rajshri";
		String Str = String.join("*", a1, b);// join two string
		System.out.println(Str);

		System.out.println("**********replace mathod**************");
		String S8 = "Mahesh is good person ,Mahesh is good in programming ";
		String str = S8.replace("Mahesh ", "Yash");
		System.out.println(str);
		
		System.out.println("***********Replace all mathod************");
		String str2 = S8.replaceAll("is", "was");
		System.out.println(str2);

		String str3 = S8.replaceAll("M", "G");
		System.out.println(str3);
		
		
		System.out.println("***************split with double parameter************");
		String S4 = "Hii:: how::are::you";
		String[] strarray2 = S4.split("::", 3);
		for (String string : strarray2) {
			System.out.println(string);
		
		
		}

		
		

	}
}
