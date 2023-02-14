package nopattern;

import java.util.Scanner;

public class palindromNo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter th no ");
		int n= sc.nextInt();
		int temp=n;
		int r,rev=0;
		while(n>0)//123
		{
			r=n%10;//3 2
			rev=rev*10+r;//3 2
			n=n/10; ////12 /2
			
		}
		System.out.println("palidrom no is"+rev);
	
	if(temp==rev) {
		System.out.println("no is palidrom ");
	}else {
		System.out.println("no is not palidrom ");
	}

}
}