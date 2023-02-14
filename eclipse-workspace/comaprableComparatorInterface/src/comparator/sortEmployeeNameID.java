package comparator;

import java.util.Comparator;

public class sortEmployeeNameID implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int result=o1.name.compareTo(o2.name);
		if(result!=0) {
			return result;
		}else {
		if(o1.id>o2.id) {
			return 1;
		}else if(o1.id==o2.id){
			return  0;
		}else {
		return -1;
		
		}
	}
	}

	
	

	
	


}
