package com.model;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.text.Keymap;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");
		shopkeeper shopkeeper = (shopkeeper) apc.getBean("s");
		System.out.println(shopkeeper);
		
		System.out.println(shopkeeper.getName());
		System.out.println(shopkeeper.getClothes());
		System.out.println(shopkeeper.getBrands());
		System.out.println(shopkeeper.getMap());
		
	}

}
