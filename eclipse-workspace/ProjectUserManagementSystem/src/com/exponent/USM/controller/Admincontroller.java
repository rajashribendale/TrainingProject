package com.exponent.USM.controller;

import java.util.Scanner;

import com.exponent.USM.service.userService;
import com.exponent.USM.serviceImpl.UserServiceImpl;

public class Admincontroller {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		boolean flag= true;
		userService us=new UserServiceImpl();
		while(flag) {
			System.out.println("----------------------------------------------------");
			System.out.println("!!!!! 1:    Add  User				!!!!!!!!!!!");
			System.out.println("!!!!! 2:    Display User Information 	!!!!!!!!!!!");
			System.out.println("!!!!! 3:    Delete User        		   !!!!!!!!!!!");
			System.out.println("!!!!! 4:     updateUserInformation   	!!!!!!!!!!!");
			System.out.println("-------------------------------------------------------");
			
			int ch=sc.nextInt();
			switch(ch) {
			
				case 1:
					us.addUsers();
					break;
				case 2:
					us.displayuserInformation();
					break;
				case 3:
					us.deleteUser();
					break;
				case 4:
					us.updateUserInformation();
					break;
				
				
				case 5:
					flag=false;
					break;
					default:
					System.out.println("invlid input...try again ");
					break;
			}
				
		}
		
		
	}

}
