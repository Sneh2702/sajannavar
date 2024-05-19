package collection;


import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<String, Integer>  htable=new Hashtable<String, Integer>();
		
		htable.put("Ajay", 50);
		htable.put("Sachin", 77);
		htable.put("Sunil", 44);
		htable.put("Dhoni", 52);
		htable.put("Virat", 100);
		
		System.out.println(htable.get("Dhoni"));
		
		
		htable.put(null,60);
		htable.put("Kapil", null);
		
		System.out.println(htable.get(null));
		
		System.out.println(htable.get("Kapil"));
		
		for(String keys:htable.keySet()){
		
		System.out.println(keys);
		System.out.println(htable.get(keys));
		
		}
}	
	
}
