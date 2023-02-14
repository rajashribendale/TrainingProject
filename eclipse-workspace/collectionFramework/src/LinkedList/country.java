package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class country {
	public List<List<String>> addcountry() {

		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Nashik");

		List<String> gujrat = new ArrayList<String>();
		gujrat.add("Vapi");
		gujrat.add("Baroda");
		gujrat.add("surat");
		
		List<List<String>> india=new ArrayList<List<String>>();
		india.add(maharashtra);
		india.add(gujrat);
		
return india;

	}
	
	public static void main(String[] args) {
		country c=new country();
		List<List<String>> india=c.addcountry();
		
		System.out.println("Using While loop");
		Iterator<List<String>>  itr =india.iterator();
		while(itr.hasNext()) {
			List<String> statelist=itr.next();
			System.out.println(statelist);
			
			Iterator<String>itr2=statelist.iterator();
			while(itr2.hasNext()) {
				String cities=itr2.next();
				System.out.println(cities);
			}
		}
		System.out.println("Using for loop");
		for (List<String>statename:india ) {
			for(String citiname:statename)
			System.out.println(citiname);
		}
		
	}
}

