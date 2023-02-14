package returnSetGet;

public class employee {

	private String name;
	private int salary;
	private String dpname;

	public void getEmployeeDetails() {
		System.out.println("Employee Details");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDpname() {
		return dpname;
	}

	public void setDpname(String dpname) {
		this.dpname = dpname;
	}

}
