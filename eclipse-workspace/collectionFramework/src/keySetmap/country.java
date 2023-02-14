package keySetmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class country {

	public Map<String, List<String>> addCountry() {

		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("mumbai");
		maharashtra.add("Nashik");
		// Map<String, String> mah = new HashMap<String, String>();
		// mah.put("PUNE", "pune");

		List<String> gujrat = new ArrayList<String>();
		gujrat.add("Surat");
		gujrat.add("Vapi");
		gujrat.add("Gandhinagar");

		Map<String, List<String>> india = new HashMap<String, List<String>>();
		india.put("MAHARASHTRA", maharashtra);
		india.put("GUJRAT", gujrat);

		return india;

	}

	public static void main(String[] args) {

		country country = new country();
		Map<String, List<String>> india = country.addCountry();
		Set<String> stateNames = india.keySet();
		System.out.println("-----using iterator interface----");
		// System.out.println(statesNames);
		Iterator<String> itr = stateNames.iterator();
		while (itr.hasNext()) {
			String stNames = itr.next();
			System.out.println(stNames);
			List<String> citiesList = india.get(stNames);
			Iterator<String> itr2 = citiesList.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}

		System.out.println("------- for each loop ------");
		for (String keys : stateNames) {
			System.out.println(keys);
			List<String> cities = india.get(keys);
			for (String city : cities) {
				System.out.println(city);
			}
		}

	}

}