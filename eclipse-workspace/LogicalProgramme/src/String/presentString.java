package String;

import java.util.Scanner;

public class presentString {
public static void main(String[] args) {
		
		String a[]= {"hii,hello,hii,Hello,hi,hi"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int count =0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=null && a[i].equals(s)){
				count++;
				
			}
		}
		if(count>0) {
			System.out.println("string is present"+count);
			
		}else {
			System.out.println("string is not present");
		}
	}
	}


