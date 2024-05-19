package collection;

import java.util.HashMap;

public class HashMp {
	
	//HashMap store element with the help if keyvalue pair
	//Insert element with the help of put (k,v)
	
	public static void main(String[] args) {
		
		
		HashMap<String, String>  hmap=new HashMap<String, String>();
		
		hmap.put("India", "New Delhi");
		hmap.put("USA", "Wash.DC");
		hmap.put("UK", "London");
		hmap.put("India", "Mumbai");
		
		System.out.println(hmap.get("USA")); //Wash.DC
		System.out.println(hmap.get("UK"));//London
		System.out.println(hmap.get("India"));//Mumbai
		System.out.println(hmap.get("AUS"));//Null
		
		
		hmap.put(null, "Berlin");
		hmap.put(null, "LA");
		
		System.out.println(hmap.get(null)); //LA
		
		hmap.put("Russia", null);
		hmap.put("France", null);
		
		System.out.println("Russia"); //null
		System.out.println("France"); //null  
	}
	
	

}
