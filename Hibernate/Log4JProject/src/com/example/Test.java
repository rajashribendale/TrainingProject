package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	public static final Logger LOGGER = LogManager.getLogger(Test.class);
	

	public static void main(String[] args) {

//		System.out.println("main method started");
		LOGGER.info("main method start");

		student stu = new student();
		stu.setRollno(11);
		if(stu.getRollno()>0) {
//			System.out.println("stu id vallid");
			LOGGER.debug("stu id vallid");
		}else {
			LOGGER.error("stu is not greater than zero");
		}
		stu.setName("rajshri");
		stu.setAdress("pune");
		System.out.println("data set ");
		studetails sd=new studetails();
		if(stu!=null) {
			sd.checkStudentData(stu);
		}else {
			LOGGER.warn("pls enter student data");
		}

		System.out.println("main method ended");
	}
}
