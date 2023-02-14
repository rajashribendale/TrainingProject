package studentMgmtSystem;

public class student {
int id;
String name;
String adress;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", adress=" + adress + ", getId()=" + getId() + ", getName()="
			+ getName() + ", getAdress()=" + getAdress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
