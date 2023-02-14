package comparator;

public class Employee {
int id;
String name;
String adress;
public Employee(int id, String name, String adress) {
	this.id = id;
	this.name = name;
	this.adress = adress;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + "]";
}

}
