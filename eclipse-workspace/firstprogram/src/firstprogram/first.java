package firstprogram;


public class first {
	
	static  {
		System.out.println("static method");
		
	}

	first() {
		System.out.println("default constructor");
	}
	
	public void A() {
		
		System.out.println(" method");
		
	}
	{
		System.out.println("non static method");
	}
	
	public static void main(String[] args) {
		first f=new first();
		f.A();
		System.out.println("main method");
		
		
		
	}
	}
	
	

