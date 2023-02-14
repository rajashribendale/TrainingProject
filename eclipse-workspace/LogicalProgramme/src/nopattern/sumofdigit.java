package nopattern;

import java.util.Scanner;

public class sumofdigit {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter th no ");
	int n= sc.nextInt();
	int r;
	int sum = 0;//123
	while(n>0) {
		r=n%10;//3 //2//1
		sum=sum+r;//3//3+2=5//5+1=6
		n=n/10;//12//1
	}
	System.out.println("Sum of no is "+sum);
	
}
}