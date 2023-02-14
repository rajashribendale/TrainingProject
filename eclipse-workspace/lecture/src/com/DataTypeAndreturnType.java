package com;

public class DataTypeAndreturnType {

	int wheelofcar=4;
	String nameofCar="kwid";
	
	public String nameonCar()
	{
	
		return "Unnati";
		
	}
	public int noofcar()
	{
		
		return 1786;
		
	}
	public static void main(String[] args) {
		
		System.out.println("Details of car");
		DataTypeAndreturnType d = new DataTypeAndreturnType();
		System.out.println("wheels of car:"+d.wheelofcar);
		System.out.println("nameof car:"+d.nameofCar);
		
		String s=d.nameonCar();
		System.out.println("nameoncar:"+s);
		
		int i = d.noofcar();
		System.out.println("noofcar:"+i);
		
		
		
	}
	
	
}
