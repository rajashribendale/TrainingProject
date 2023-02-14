package com.Array;

public class Test {
//
//	public static void main(String[] args) {
//	int [] intofarray=new int[5];
//	intofarray[0]=10;
//	intofarray[2]=30;
// intofarray[1]=20;
// intofarray[3]=40;
// intofarray[4]=50;
// System.out.println(intofarray.length);//to check length
// System.out.println(intofarray[0]);
// System.out.println(intofarray[1]);
// System.out.println(intofarray[2]);
// System.out.println(intofarray[3]);
// System.out.println(intofarray[4]);	
// }
//	 
//}
	public static void main(String[] args) {

		System.out.println("using foreachloop");
		int[] intofArray = { 10, 20, 30, 40, 50 };
		for (int i : intofArray)
			
		{
			System.out.println(i);
		}
		System.out.println("String aaray");

		String[] stringofArray = { "Abc", "Xyz" };
		for (String s : stringofArray) {
			System.out.println(s);
		}
		System.out.println("-----char array-----");

		char[] charofArray = { 'a', 'b', 'c' };

		for (char c : charofArray) {
			System.out.println(c);
		}

	}
}