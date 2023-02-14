package com.practiceParametersiedMethod;

public class Home {

	public void HeadOfFamilyInfo() {

		Member m = new Member();
		m.age = 55;
		m.name = "Ganesh";

		Family F = new Family();
		F.displyaHeodoffamilyInfo(m);
		
	}
		
		
		public void ALLMembersInfo()
		{
			
			AllMembers all =new AllMembers();
			
			all.m1.age=36;
			all.m1.name="datta";
			
			all.m2.age=32;
			all.m2.name="rupali";
			
			all.m3.age=30;
			all.m3.name="ranu";
			
			Family F = new Family();
			F.displayAllFamilyMembersInfo(all);
			
			
			
			
			
			
			
		}
	}

