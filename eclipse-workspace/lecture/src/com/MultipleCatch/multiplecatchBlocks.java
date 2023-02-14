package com.MultipleCatch;

public class multiplecatchBlocks {
	public static void main(String[] args) {
		System.out.println("MAin Method");
		try {
			System.out.println("inside try block");
			String s=args[1];
			System.out.println(s);
			int i=Integer.parseInt(s);
			System.out.println(i);
			int j=10/i;
			System.out.println(j);
			String s1="abc";
			System.out.println(s1.length());
			
		} 
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			
//			
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}catch(NullPointerException e) {
//			e.printStackTrace();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		catch(ArrayIndexOutOfBoundsException|ArithmeticException 
				|NullPointerException e ) {
		
		}
		
	}
}

	


