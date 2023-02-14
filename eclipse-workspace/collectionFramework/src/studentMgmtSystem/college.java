package studentMgmtSystem;

import java.util.ArrayList;
import java.util.List;

public class college {

	public List<student> addStudentDetails() {
		student s=new student();
		s.setId(11);
		s.setName("ABC");
		s.setAdress("Pune");
		
		student s1=new student();
		s1.setId(12);
		s1.setName("DEF");
		s1.setAdress("PCMC");
		
		student s2=new student();
		s2.setId(13);
		s2.setName("GHI");
		s2.setAdress("PIMPRI");
		
		
		List<student>listofstudent=new ArrayList<student>();
		listofstudent.add(s);
		listofstudent.add(s1);
		listofstudent.add(s2);
		
		return listofstudent;
	}
}
