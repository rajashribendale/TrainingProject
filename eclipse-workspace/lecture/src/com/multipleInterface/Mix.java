package com.multipleInterface;

public  class Mix implements C{

	@Override
	public void show() {
		System.out.println("All A B C methods Implemted ");
	}
//	public abstract void d();
//	{
//		System.out.println("own method of mix class");
//	}
	
	
	public static void main(String[] args) {
		Mix m=new Mix();
		m.show();
	}

}