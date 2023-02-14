package keySetmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class World {

	public Map<String, Map<String, List<String>>> addcountry() {
		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Nashik");

		List<String> gujrat = new ArrayList<String>();
		gujrat.add("Vapi");
		gujrat.add("Baroda");
		gujrat.add("surat");

		Map<String, List<String>> India = new HashMap<String, List<String>>();
		India.put("MAHARASHTRA", maharashtra);
		India.put("GUJRAT", gujrat);

		List<String> California = new ArrayList<String>();
		California.add("Los Angeles");
		California.add("san Diego");
		California.add("san Francisco ");

		List<String> Texas = new ArrayList<String>();
		Texas.add("Houston");
		Texas.add("austin");
		Texas.add("dallas");

		Map<String, List<String>> Usa = new HashMap<String, List<String>>();
		Usa.put("CALIFORNIA", California);
		Usa.put("TEXAS", Texas);

		Map<String, Map<String, List<String>>> World = new HashMap<String, Map<String, List<String>>>();
		World.put("India", India);
		World.put("USA", Usa);

		return World;
	}

	public static void main(String[] args) {

		World w = new World();
		Map<String, Map<String, List<String>>> world = w.addcountry();
		System.out.println(world);
		Set<String> worldkey = world.keySet();
		System.out.println(worldkey);
		System.out.println("Using Iterator Inteface");
		Iterator<String> itr = worldkey.iterator();
		while (itr.hasNext()) {
			String STATE = itr.next();
			System.out.println(STATE);
			Map<String, List<String>> statename = world.get(STATE);
			System.out.println(statename);

			Set<String> keySTATE = statename.keySet();
			System.out.println(keySTATE);

			Iterator<String> itr2 = keySTATE.iterator();
			while (itr2.hasNext()) {
				String cities = itr2.next();
				List<String> keycity = statename.get(cities);
				System.out.println(keycity);

				Iterator<String> itr3 = keycity.iterator();
				while (itr3.hasNext()) {
					String cities1 = itr3.next();
					System.out.println(cities1);
				}

			}

		}
		System.out.println("using for each loop");
		for (String country : worldkey) {
			Map<String, List<String>> statename = world.get(country);
			Set<String> city=statename .keySet();
			for(String cities:city) {
				List<String> c=statename.get(cities);
				for (String string : c) {
					System.out.println(string);
					
					
				}
			}
		}

	}
}
