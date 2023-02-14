package JDBCClassMgmtSystemProejct.Controller;

public class controller {
	package com.Exponent.classmgmtSyst.controller;

	import java.security.Provider.Service;
	import java.util.Scanner;

	import com.Exponent.classmgmtSyst.Service.service;
	import com.Exponent.classmgmtSyst.ServiceImpl.serviceImpl;

	public class Controller {
		public static void main(String[] args) {
			
			
			service s=new serviceImpl();
			Scanner sc=new Scanner (System.in);
			boolean flag=true;
			while(flag) {
				System.out.println("******WELCOME TO CLASS*****");
				System.out.println("Please Select  The OPTION");
				System.out.println(" 1 :  ADD COURSE DETAILS");
				System.out.println(" 2 :  DISPLAY COURSE DETAILS");
				System.out.println(" 3 :  remove COURSE DETAILS");
				System.out.println(" 4 :  ADD FACULTY DETAILS");
				System.out.println(" 5 :  DISPLAY FACULTY DETAILS");
				System.out.println(" 6 :  ADD BATCH DETAILS");
				System.out.println(" 7 :  DISPLAY BATCH DETAILS");
				System.out.println(" 8 :  ADD STUDDENT DETAILS");
				System.out.println(" 9 :  DISPLAY  DETAILS");
				System.out.println(" 10 :  remove student");
				System.out.println(" 11 :	 EXIT ");
				
				int ch=sc.nextInt();
				switch (ch) {
				case 1:
					s.addCourse();
					break;

				case 2:
					s.displayCourse();
					break;
				case 3:
					s.removecourse();
					break;


				case 4:
					s.addFaculty();
					break;

				case 5:
					s.displayfaculty();
					break;

				case 6:
					s.addBatch();
					break;

				case 7:
					s.displaybatch();
					break;

				case 8:
					s.addstudent();
					break;

				case 9:
					s.displaystudent();
					break;
				case 10:
					s.Removestudent();

				case 11:
					flag = false;
					break;
					
				default :
					System.out.println("\n Please enter valid input");

					
					break;

			
				}
			}
		}

	}

}
