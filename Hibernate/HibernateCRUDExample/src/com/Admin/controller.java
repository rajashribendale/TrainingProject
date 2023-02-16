package com.Admin;

import java.util.Scanner;

import com.service.designationService;
import com.service.designationServiceImpl;

public class controller {
	
	public static void main(String[] args) {
		System.out.println("*********APPLICATION STARTED**********");
		
		designationService ds=new designationServiceImpl();
		Scanner sc=new Scanner(System.in);

		while (true) {
			System.out.println("*****1. Add Designation Data**************");
			System.out.println("*****2. Show All Designation Data*********");
			System.out.println("*****3. Get Single Designation Data*********");
			System.out.println("******4. Update Designation Data********");
			System.out.println("******5. Delete Designation Data*********");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				ds.addDesignationData();
				break;
			case 2:
				ds.showAllData();
				break;
			case 3:
				ds.getSingleData();
				break;
			case 4:
				ds.updateData();
				break;
			case 5:
				ds.deleteData();
				break;
			default:
				break;
			}
	}

	}
}
