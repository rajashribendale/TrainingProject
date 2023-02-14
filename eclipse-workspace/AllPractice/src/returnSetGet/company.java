package returnSetGet;

public class company {
	
	public employee displayEmployeeDetails()
	{
		employee e=new employee();
		e.getEmployeeDetails();
		e.setSalary(40000);
		e.setDpname("Finance");
		e.setName("ABC");
		
		System.out.println(e.getDpname());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		return(e);
		
	}
	public static void main(String[] args) {
		
		company c=new company();
		
			c.displayEmployeeDetails();
				
				
	}
		
		
		
		

		
		
		
		
	}

