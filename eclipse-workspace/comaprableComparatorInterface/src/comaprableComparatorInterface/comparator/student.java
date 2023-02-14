package comaprableComparatorInterface.comparator;

import java.util.Comparator;

public class student implements Comparable<student> {
	int id;
	String name;
	String adress;

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}

	public student(int id, String name, String adress) {

		this.id = id;
		this.name = name;
		this.adress = adress;
	}

	@Override
	public int compareTo(student o) {
		if (this.id > o.id) {
			return 1;

		} else if (this.id == o.id) {
			return 0;
		} else {

			return -1;
		}

	}
}
