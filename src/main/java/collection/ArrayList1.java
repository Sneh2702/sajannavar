package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Ranjeet");
		list.add("Geeta");
		list.add("Rohan");
		list.add("Sachin");
		list.add("Rohan");
		
		System.out.println("ArrayList" +list);
		
		//retrive using Get()
		
		for (int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
		
	
	//could you plz explain without for loop
		//we are retrieve data using Iterator
		//explai iterator
 
		Iterator<String> itr=list.iterator();
		
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
}
}
