package studentMgmtSystem;

import java.util.Iterator;
import java.util.List;

public class unniversity {
	public static void main(String[] args) {
		college c=new college();
		
		List<student> liststudent=c.addStudentDetails();
		
		System.out.println("using iterort");
		Iterator<student> itr=liststudent.iterator();
		while(itr.hasNext())
		{
			student s=itr.next();
//			System.out.println("studentid"+s.getId());
//			System.out.println("student name"+s.getName());
//			System.out.println("student adress"+s.getAdress());
			System.out.println(s);
		}
			System.out.println("using for each loop");
			for(student S:liststudent)
			{
				System.out.println(S.toString());
			
			}
		}
	}

