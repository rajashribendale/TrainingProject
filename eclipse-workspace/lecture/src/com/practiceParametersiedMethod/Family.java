package com.practiceParametersiedMethod;

public class Family {

	public void displyaHeodoffamilyInfo(Member M) {

		System.out.println(M.age);
		System.out.println(M.name);

	}

	public void displayAllFamilyMembersInfo(AllMembers all) {

		System.out.println(all.m1.age);
		System.out.println(all.m1.name);

		System.out.println(all.m2.age);
		System.out.println(all.m2.name);

		System.out.println(all.m3.age);
		System.out.println(all.m3.name);
	}

	public static void main(String[] args) {

		Home h = new Home();
		h.HeadOfFamilyInfo();

		System.out.println("-------");

		h.ALLMembersInfo();

	}

}
