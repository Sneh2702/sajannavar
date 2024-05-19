package oops;

public class Person2 {
	
	public static void main(String[] args) {
		
		Person1 bali=new Person1 (); //Creating object of Person1
		bali.enroll ();
		
		Person1 geeta=new Person1 (); //Creating object of Person1
		geeta.enroll ();
		
		Person1 ram=new Person1 (); //Creating object of Person1
		ram.enroll ();
		
		//parameterized constructor
		
		Person1 sita=new Person1("Sita", 27);
		sita.enroll();
		
		Person1 laxman=new Person1("Laxman", 28);
		laxman.enroll();
	}

}
