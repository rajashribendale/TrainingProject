package com.ExceptionHandling;

public class Solution1 {
	public static void main(String[] args) {
		try {
			System.out.println("This statement will be executed ");
			Integer i=new Integer ("abc");
			System.out.println("value of i:"+i);
			
			
		} catch (Exception e) {
			e.getStackTrace()
		}
	}

}
