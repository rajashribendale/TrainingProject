package mix;

public class student {
	int id;
	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", adress=" + adress + ", mobno=" + mobno + "]";
	}
	String name;
	String adress;
	Long mobno;
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
	public Long getMobno() {
		return mobno;
	}
	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
	
	

}
