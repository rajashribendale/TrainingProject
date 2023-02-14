package exceptionHanldingWay;

public class person {
	public int ageofperson()
	{try {
		System.out.println("age of person");
	}
	catch(IllegalArgumentException e) {
		System.out.println("catch block");
		e.printStackTrace();
	}
	return -8;
	}
	
	
	public static void main(String[] args) {
		
		person p=new person();
		int i=p.ageofperson();
		System.out.println(i);
		
	
	}
	
}
