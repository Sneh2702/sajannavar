package oops;

public class MethodOverriding2 extends MethodOverriding1 {

	public void makePayment() {
		
		String firstName;
		String lastname;
		int accountNumber;
		int mobileNumber;
		
		System.out.println("Make Payment for SBI");
	}
	
	public static void main(String[] args) {
		MethodOverriding2 mo2=new MethodOverriding2();
		mo2.makePayment(); //child class method will get execute
		
		MethodOverriding1 mo1=new MethodOverriding1();
		mo1.makePayment(); // Paent class method 
	}
}
