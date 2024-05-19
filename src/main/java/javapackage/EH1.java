package javapackage;

public class EH1 {
	
	public static void main(String[] args) {
		try {
			
			int data=50/0; //enclosed code
		}catch (NullPointerException n) {
			
			System.out.println(n);
					}
		catch (ArithmeticException a) { //only this will execute
			System.out.println(a);
			
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
