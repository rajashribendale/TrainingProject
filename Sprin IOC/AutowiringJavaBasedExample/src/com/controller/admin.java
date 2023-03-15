package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.confi.App;
import com.pojo.Login;
import com.pojo.User;

public class admin {
	public static void main(String[] args) {
		ApplicationContext apc=new AnnotationConfigApplicationContext(App.class);
		Login login=(Login) apc.getBean("login") ;
		System.out.println(login);
	}

}
