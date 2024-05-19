package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("India");
		hs.add("USA");
		hs.add("Japan");
		hs.add("China");
		hs.add("USA");
		
		System.out.println("HashSet:" + hs);
		
		//we are retrieve data using Iterator
		Iterator<String> itr=hs.iterator();
		
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//
		
	}

}
