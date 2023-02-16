package com.admin;

import java.util.Scanner;

import com.Service.PersonImpl;
import com.Service.PersonService;

public class Controller {
	public static void main(String[] args) {

		System.out.println("************* Application Start******************");

		PersonService ps = new PersonImpl();

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("1. Add Person and Aadhar Data.");
			System.out.println("2. Show All Data.");
			System.out.println("3. Get Single Data using person Id");
			System.out.println("4. update only person Data.");
			System.out.println("5. Update Aadhar Data using person id.");
			System.out.println("6. Delete Person Data.");
			System.out.println("7.delete particular AdharDetails");
			
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				ps.addPersonwithAadharDetails();
				break;
			case 2:
				ps.showAllData();
				break;
			case 3:
				ps.getSinglePersonData();
				break;
			case 4:
				ps.updatePersonData();
				break;
			case 5:
				ps.updateAadharDatausingPersonId();
				break;
			case 6:
				ps.deletePersonData();
				break;
			case 7:
				ps.deleteadhardetailsusingPersonId();
				break;
			default:
				System.out.println("Invalid choice..pleasev reEnter");
				break;
			}
		}
	}

}


