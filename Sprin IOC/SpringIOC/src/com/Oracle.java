package com;

public class Oracle  implements Connection{

	@Override
	public void conOn() {
		System.out.println(" Oracle connection on");				
	}

	@Override
	public void conOf() {
		System.out.println(" Oracle connection off");		
		
	}

}
