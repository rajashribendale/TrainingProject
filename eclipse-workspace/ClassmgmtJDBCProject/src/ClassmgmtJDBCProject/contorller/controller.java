package ClassmgmtJDBCProject.contorller;


	import java.security.Provider.Service;
	import java.util.Scanner;

import ClassmgmtJDBCProject.service.service;
import ClassmgmtJDBCProject.serviceimpl.serviceimpl;

	public class controller {
		public static void main(String[] args) {
			
			
			service s=new serviceimpl();
			Scanner sc=new Scanner (System.in);
			boolean flag=true;
			while(flag) {
				System.out.println("******WELCOME TO CLASS*****");
				System.out.println("Please Select  The OPTION");
				System.out.println(" 1 :  ADD COURSE DETAILS");
				System.out.println(" 2 :  DISPLAY COURSE DETAILS");
				System.out.println(" 3 :  ADD FACULTY DETAILS");
				System.out.println(" 4 :  DISPLAY FACULTY DETAILS");
				System.out.println(" 5 :  ADD BATCH DETAILS");
				System.out.println(" 6 :  DISPLAY BATCH DETAILS");
				System.out.println(" 7 :  ADD STUDDENT DETAILS");
				System.out.println(" 8 :  DISPLAY  DETAILS");
				System.out.println(" 9 :	 EXIT ");
				
				int ch=sc.nextInt();
				switch (ch) {
				case 1:
					s.addCourse();
					break;

				case 2:
					s.displayCourse();
					break;
				

				case 3:
					s.addFaculty();
					break;

				case 4:
					s.displayfaculty();
					break;

				case 5:
					s.addBatch();
					break;

				case 6:
					s.displaybatch();
					break;

				case 7:
					s.addstudent();
					break;

				case 8:
					s.displaystudent();
					break;
				

				case 10:
					flag = false;
					break;
					
				default :
					System.out.println("\n Please enter valid input");

					
					break;

			
				}
			}
		}

	}

