package comparator;

import java.util.Comparator;

public class sortbyEmployeeId  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.id>o2.id) {
			return 1;
		}else if(o1.id==o2.id){
			return  0;
		}else {
		return -1;
		}
	}

}
