package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class world {

	public List<List<List<String>>> addcountry() {
		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Nashik");
		
		List<String> gujrat = new ArrayList<String>();
		gujrat.add("Vapi");
		gujrat.add("Baroda");
		gujrat.add("surat");

		List<List<String>> India = new ArrayList<List<String>>();
		India.add(maharashtra);
		India.add(gujrat);

		List<String> California = new ArrayList<String>();
		California.add("Los Angeles");
		California.add("san Diego");
		California.add("san Francisco ");

		List<String> Texas = new ArrayList<String>();
		Texas.add("Houston");
		Texas.add("austin");
		Texas.add("dallas");

		List<List<String>> USA = new ArrayList<List<String>>();
		USA.add(California);
		USA.add(Texas);

		List<List<List<String>>> World = new ArrayList<List<List<String>>>();
		World.add(India);
		World.add(USA);
		return World;
	}

	public static void main(String[] args) {
		world w = new world();
		List<List<List<String>>> World = w.addcountry();
		System.out.println("while loop");
		Iterator<List<List<String>>> itr = World.iterator();
		while (itr.hasNext()) {
			List<List<String>> Country = itr.next();
			System.out.println(Country);
			
			
			
			Iterator<List<String>> itr2 = Country.iterator();
			while (itr2.hasNext()) {
				List<String> state = itr2.next();
				System.out.println(state);
				
				
				Iterator<String> itr3 = state.iterator();
				while (itr3.hasNext()) {
					String cities = itr3.next();
					System.out.println(cities);
				}
			}
		}
		System.out.println("****************************************************");
		System.out.println("by using for each loop");
		for (List<List<String>> Countryname : World) {
			for (List<String> statename : Countryname) {
				for (String cities : statename) {
					System.out.println(cities);
				}
			}
		}
	}
}
