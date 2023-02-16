package com.admin;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.entity.Person;
import com.service.PersonImpl;
import com.service.PersonService;

public class Controller {
	public static final Logger LOGGER = LogManager.getLogger(Controller.class);
		public static void main(String[] args) {

			LOGGER.info("************* Application Start******************");

			PersonService ps = new PersonImpl();

			Scanner sc = new Scanner(System.in);

			while(true) {
				LOGGER.info("1. Add Person and Aadhar Data.");
				LOGGER.info("2. Show All Data.");
				LOGGER.info("3. Get Single Data using person Id");
				LOGGER.info("4. update only person Data.");
				LOGGER.info("5. Update Aadhar Data using person id.");
				LOGGER.info("6. Delete Person Data.");
				
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
				default:
					LOGGER.warn("Invalid choice..pleasev reEnter");
					break;
				}
			}
		}

	}

