package oops;

public class Encapsulaion2 {
	
	public static void main(String[] args) {
		
		Encapsulation1 e1=new Encapsulation1 ();
		//System.out.println(e1.fullName);
		
		e1.setFullName("Snehal");
		e1.setAccountNumber(123456);
		e1.setMobileNumber(12345);
		
		System.out.println(e1.getFullName());
		System.out.println(e1.getAccountNumber());
		System.out.println(e1.getMobileNumber());
		
	
	}
}